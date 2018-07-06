package com.myy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myy.pojo.House;
import com.myy.pojo.Master;
import com.myy.pojo.Student;
import com.myy.service.HouseService;
import com.myy.service.MasterService;
import com.myy.service.StudentService;

@Controller
public class LoginController {
    @Autowired
	private StudentService studentService;
    @Autowired
    private MasterService masterService;
    
    @Autowired
    private HouseService houseService;
    
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String showLoginView(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		return "login";	
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	 public String processLogin (Student student,Model model,HttpSession session) {
		model.addAttribute(new House());
		String Username=student.getStudentusername();
		String Password=DigestUtils.md5Hex(student.getStudentpassword());
		Master master=masterService.findMasterByMasterName(Username, Password);
		Student student2=studentService.findStudentByStudentName(Username, Password);
		if(student.getStudentchecked()==null)
			return "login";
		if(student.getStudentchecked().equals("2")) {
			//System.out.println(student.getStudentusername());
			boolean existed = masterService.findMasterByName(Username, Password);
			if(existed) {
				model.addAttribute(new House());
			   session.setAttribute("myMaster", master);
			   model.addAttribute("master", master);
				return "index";				
			}else {
				 return "login";
			}
		
		}
		boolean isExit = studentService.findStudentByUserName(Username, Password);
		if(isExit) {
			session.setAttribute("myStudent", student2);
			model.addAttribute("student",student2);
			List<House> houseList = houseService.showAllHouses();
			model.addAttribute("houseList", houseList);
			return "studentIndex";
		} else {
			return "login";
		}
	
 
	   
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login2(Model model,HttpSession session) {
		Master master = (Master) session.getAttribute("myMaster");
		model.addAttribute(new House());
		model.addAttribute("master", master);
		return "index";	
	}
	
	
	
	
	
	
	
	
	
	
  
	
}
