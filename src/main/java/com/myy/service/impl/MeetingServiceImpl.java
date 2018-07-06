package com.myy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myy.mapper.MeetingMapper;
import com.myy.pojo.House;
import com.myy.pojo.Meeting;
import com.myy.pojo.MeetingExample;
import com.myy.pojo.MeetingExample.Criteria;
import com.myy.service.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService {

	@Autowired
	private MeetingMapper meetingMapper;
	@Override
	public void insertMeetingInfo(String stuName, House house, String masterName) {
		Meeting meeting=new Meeting();
		meeting.setMeethousehold(stuName);
		meeting.setMeethouseinfo(house.getHouseinfo());
		meeting.setMeethousemastername(masterName);
		meeting.setMeethouseprice(house.getHouseprice());
		meeting.setMeettime("周六下午三点");
		meeting.setMeethouseadd("华侨大学西门");
		long timeMillis = System.currentTimeMillis();
	   String id = Long.toString(timeMillis);
       meeting.setMeetid(id);
		meetingMapper.insert(meeting);
		

	}
	@Override
	public List<Meeting> findMeetingListByMasterName(String masterName) {
	     MeetingExample example=new MeetingExample();
	     Criteria criteria=example.createCriteria();
	     criteria.andMeethousemasternameEqualTo(masterName);
	     return meetingMapper.selectByExample(example);
	
	}
	@Override
	public List<Meeting> findMeetingListByStuName(String stuName) {
	     MeetingExample example=new MeetingExample();
	     Criteria criteria=example.createCriteria();
        criteria.andMeethouseholdEqualTo(stuName);
	     return meetingMapper.selectByExample(example);
	}

}
