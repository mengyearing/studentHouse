package com.myy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myy.pojo.House;
import com.myy.pojo.Master;
import com.myy.pojo.Meeting;
import com.myy.pojo.Student;
import com.myy.service.HouseService;
import com.myy.service.MeetingService;

@Controller
public class MeetingController {
    
	@Autowired
	private HouseService houseService;
	
	@Autowired
	private MeetingService meetingService;
	
	@RequestMapping("/makeMeeting/{houseId}")
	public String makeMeetings(@PathVariable String houseId,HttpSession session,Model model) {
		Master master = (Master) session.getAttribute("myMaster");
		House house=houseService.findHouseById(houseId);
		meetingService.insertMeetingInfo(house.getHousehold(), house, master.getMastrname());
		model.addAttribute("master", master);
		model.addAttribute(new House());
		return "index";
	}
	
	
	@RequestMapping("/masterMeetingInfo")
    public String showMasterMeetings(HttpSession session,Model model)	{
		Master master = (Master) session.getAttribute("myMaster");
		List<Meeting>list=meetingService.findMeetingListByMasterName(master.getMastrname());
		model.addAttribute("meetingList", list);
		model.addAttribute("master", master);
		return "masterMeeting";
	}
	
	@RequestMapping("/studentMeetingInfo")
    public String showStudentMeetings(HttpSession session,Model model)	{
		Student student= (Student) session.getAttribute("myStudent");
		List<Meeting>list=meetingService.findMeetingListByStuName(student.getStudentusername());
		model.addAttribute("meetingList", list);
		model.addAttribute("student", student);
		return "studentMeeting";
	}
	
}
