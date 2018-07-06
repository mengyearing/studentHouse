package com.myy.service;

import java.util.List;

import com.myy.pojo.House;
import com.myy.pojo.Meeting;

public interface MeetingService {
	
	void insertMeetingInfo(String stuName,House house,String masterName);
    List<Meeting> findMeetingListByMasterName(String masterName);
    List<Meeting> findMeetingListByStuName(String stuName);
}
