package com.myy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myy.mapper.MasterMapper;
import com.myy.pojo.Master;
import com.myy.pojo.MasterExample;
import com.myy.pojo.MasterExample.Criteria;
import com.myy.service.MasterService;

@Service
public class MasterServiceImpl implements MasterService {
    
	@Autowired
	private MasterMapper masterMapper;
	@Override
	public boolean findMasterByName(String masterUsername, String masterPassword) {
		List<Master>list=new ArrayList<Master>();
		MasterExample example=new MasterExample();
		Criteria criteria=example.createCriteria();
		criteria.andMastrnameEqualTo(masterUsername);
		criteria.andMasterpasswordEqualTo(masterPassword);
		list=masterMapper.selectByExample(example);
	
		if(!list.isEmpty()) {
			return true;
		}

		return false;
	}
	@Override
	public void addMaster(Master master) {
		long currentTimeMillis = System.currentTimeMillis();
		String masterId=currentTimeMillis+"";
		master.setMasterid(masterId);
		master.setMastermoney(5000.00);
		master.setMasterpassword(DigestUtils.md5Hex(master.getMasterpassword()));
		masterMapper.insert(master);

	}
	@Override
	public Master findMasterByMasterName(String masterUsername, String masterPassword) {
		// TODO Auto-generated method stub
		List<Master>list=new ArrayList<Master>();
		MasterExample example=new MasterExample();
		Criteria criteria=example.createCriteria();
		criteria.andMastrnameEqualTo(masterUsername);
		criteria.andMasterpasswordEqualTo(masterPassword);
		list=masterMapper.selectByExample(example);
		if(!list.isEmpty()) {
			return list.get(0);
		}
		
		return null;
	}

}
