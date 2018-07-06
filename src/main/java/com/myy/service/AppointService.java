package com.myy.service;

import java.util.List;

import com.myy.pojo.Appointment;

public interface AppointService {
	
	void addAppointment(String houseId,String studentId,String masterId);
	List<Appointment> selectAppointByStudentId(String studentId);
	List<Appointment> selectAppointByMasterId(String masterId);

}
