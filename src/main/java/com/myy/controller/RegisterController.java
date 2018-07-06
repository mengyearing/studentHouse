package com.myy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myy.pojo.Master;
import com.myy.pojo.Student;
import com.myy.service.MasterService;
import com.myy.service.StudentService;

@Controller
public class RegisterController {
    @Autowired
	private StudentService studentService;
    @Autowired
	private MasterService masterService;
    
    @RequestMapping(value="studentRegister",method=RequestMethod.GET)
	public String getRegisterView(Model model) {
		model.addAttribute(new Student());
		return "registeration";
	}
	
    @RequestMapping(value="masterRegister",method=RequestMethod.GET)
	public String getmasterRegisterView(Model model) {
		model.addAttribute(new Master());
		return "masterRegister";
	}
    
	@RequestMapping(value="masterRegister",method=RequestMethod.POST)
	   public String processMasterRegister(Master master) {
	    String masterUsername=master.getMastrname();
	    String masterPassword=master.getMasterpassword();
	   boolean isExited = masterService.findMasterByName(masterUsername, masterPassword);
	    // boolean isExited = studentService.findStudentByUserName(stuUsername, stuPassword);
		if(isExited) {
			return "masterRegister";
		}
         masterService.addMaster(master);
   	    return "redirect:/";
	}
    
    
	@RequestMapping(value="studentRegister",method=RequestMethod.POST)
	   public String processRegister(@Valid Student student,Errors errors,Model model) {
		   if(errors.hasErrors()) {
	           model.addAttribute(new Student());
			   return "registeration";
		   }
	    String stuUsername=student.getStudentusername();
	    String stuPassword=student.getStudentpassword();
	    boolean isExited = studentService.findStudentByUserName(stuUsername, stuPassword);
		if(isExited) {
			  model.addAttribute(new Student());
			return "registeration";
		}

		 studentService.addStudent(student);
      	return "login";
	}
	
	
	
	
	
	
}
