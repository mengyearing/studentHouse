package com.myy.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myy.pojo.Appointment;
import com.myy.pojo.House;
import com.myy.pojo.Master;
import com.myy.pojo.Student;
import com.myy.service.AppointService;
import com.myy.service.HouseService;
import com.myy.service.StudentService;

@Controller
public class AppointmentController {
	
	@Autowired
	private AppointService appointService;
	
	@Autowired
	private HouseService houseService;
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/stuSelectHouse/{houseId}")
	public String stuMakeAppoint(@PathVariable String houseId,HttpSession session,Model model) {
		Student student=(Student) session.getAttribute("myStudent");
		House house=houseService.findHouseById(houseId);
		appointService.addAppointment(houseId, student.getStudentid(),house.getHousehostid());
		System.out.println("11111"+houseId);
		List<House>houseList=houseService.showAllHouses();
		model.addAttribute("houseList", houseList);
		model.addAttribute("student", student);
		return "studentIndex";
	}
	
	@RequestMapping(value="/stuSelectHouse2")
	public String stuMakeAppoint(HttpSession session,Model model) {
		Student student=(Student) session.getAttribute("myStudent");
		List<House>houseList=houseService.showAllHouses();
		model.addAttribute("houseList", houseList);
		model.addAttribute("student", student);
		return "studentIndex";
	}
	
	@RequestMapping(value="showStuAppoint")
	public String showStudentAppointment(HttpSession session,Model model) {
		Student student=(Student) session.getAttribute("myStudent");
		List<Appointment> list1 = appointService.selectAppointByStudentId(student.getStudentid());
		List<House> houseList =new ArrayList<House>();
		for (Appointment appointment : list1) {
			House house=new House();
			 house=houseService.findHouseById(appointment.getHouseid());
			
			 houseList.add(house);
		}
		model.addAttribute("student", student);
		model.addAttribute("houseList", houseList);
		return "showStuAppointment";
			
	}
	
	@RequestMapping("/masterAppointment")
	public String showMasterApps(Model model,HttpSession session) {
		
		Master master = (Master) session.getAttribute("myMaster");
		List<Appointment> appList = appointService.selectAppointByMasterId(master.getMasterid());
		List<House>houseList=new ArrayList<House>();
		for (Appointment appointment : appList) {
			House house=houseService.findHouseById(appointment.getHouseid());
			Student student=studentService.findStudentById(appointment.getStudentid());
			house.setHousehold(student.getStudentusername());
			houseService.houseUpdate(house);
			houseList.add(house);
		}
		
		model.addAttribute("houseList", houseList);
		model.addAttribute("master", master);
		
		return "masterAppointment";
	}
	
	
	
	

}
