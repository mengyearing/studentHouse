package com.myy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myy.pojo.House;
import com.myy.pojo.Master;
import com.myy.service.HouseService;

@Controller
public class HouseController {
    
	@Autowired
	private HouseService houseService;
	
	@RequestMapping(value="/masterToRent",method=RequestMethod.POST)
	public String masterToRent(House house,Model model,HttpSession session) {
	  Master master=(Master) session.getAttribute("myMaster");
		int result=houseService.insertHouse(house,master);
	 List<House> list= houseService.findHouseByMasterName(house.getHousehostname());
	 model.addAttribute("houseList", list);
	 model.addAttribute("master", master);
	  if(result==1) {
		  return "redirect:/showMatserIndex";
	  }else {
		  return "masterToRent";
	  }
	
	
	

	
	}	
	
}
