package com.myy.service;

import com.myy.pojo.Master;

public interface MasterService {

	boolean findMasterByName(String masterUsername,String masterPassword);
	void addMaster(Master master);
	Master findMasterByMasterName(String masterUsername,String masterPassword);
}
