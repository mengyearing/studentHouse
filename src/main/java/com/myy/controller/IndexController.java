package com.myy.controller;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myy.pojo.House;
import com.myy.pojo.Master;

@Controller
public class IndexController {

	@RequestMapping("/showMatserIndex")
	public String showMasterIndex(Model model,HttpSession session) {
		model.addAttribute(new House());
		 Master master=(Master) session.getAttribute("myMaster");
		 model.addAttribute("master", master);
		 return "index";
	
	}
	
}
