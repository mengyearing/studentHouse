package com.myy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myy.mapper.AppointmentMapper;
import com.myy.pojo.Appointment;
import com.myy.pojo.AppointmentExample;
import com.myy.pojo.AppointmentExample.Criteria;
import com.myy.service.AppointService;

@Service
public class AppointServiceImpl implements AppointService {
	
	@Autowired
	private AppointmentMapper appointMapper;

	@Override
	public void addAppointment(String houseId, String studentId,String masterId) {
     
		Appointment appointment=new Appointment();
		appointment.setStudentid(studentId);
		appointment.setHouseid(houseId);
		long currentTimeMillis = System.currentTimeMillis();
		String appId=Long.toString(currentTimeMillis);
		appointment.setAppid(appId);
		appointment.setMasterid(masterId);
		appointMapper.insert(appointment);
	}

	@Override
	public List<Appointment> selectAppointByStudentId(String studentId) {
      AppointmentExample example=new AppointmentExample();
      Criteria criteria=example.createCriteria();
      criteria.andStudentidEqualTo(studentId);
      List<Appointment> list = appointMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<Appointment> selectAppointByMasterId(String masterId) {
		AppointmentExample example=new AppointmentExample();
	      Criteria criteria=example.createCriteria();
	      criteria.andMasteridEqualTo(masterId);
	      List<Appointment> list = appointMapper.selectByExample(example);
		 return list;
	}
	
	
	
	
	

}
