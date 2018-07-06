package com.myy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myy.mapper.HouseMapper;
import com.myy.pojo.House;
import com.myy.pojo.HouseExample;
import com.myy.pojo.HouseExample.Criteria;
import com.myy.pojo.Master;
import com.myy.service.HouseService;

@Service
public class HouseServiceImpl implements HouseService {
   
	@Autowired
	private HouseMapper houseMapper;
	
	@Override
	public int insertHouse(House house,Master master) {
		long currentTimeMillis = System.currentTimeMillis();
		String houseId =  currentTimeMillis+" ";
		house.setHouseid(houseId);
		house.setHousehostid(master.getMasterid());
		return houseMapper.insert(house);	
	}

	@Override
	public List<House> findHouseByMasterName(String masterName) {
     HouseExample example=new HouseExample();
     Criteria criteria=example.createCriteria();
     criteria.andHousehostnameEqualTo(masterName);
     List<House>list=new ArrayList<House>();
     list=houseMapper.selectByExample(example);
     return list;

	}

	@Override
	public List<House> showAllHouses() {
		List<House> list=houseMapper.selectByExample(null);
		return list;
	}

	@Override
	public House findHouseById(String houseId) {
		return houseMapper.selectByPrimaryKey(houseId);

	}

	@Override
	public void houseUpdate(House house) {
		houseMapper.updateByPrimaryKey(house);
		
	}

}
