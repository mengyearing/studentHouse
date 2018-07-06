package com.myy.service;

import java.util.List;

import com.myy.pojo.House;
import com.myy.pojo.Master;

public interface HouseService {
    int insertHouse(House house,Master master);
    List<House>findHouseByMasterName(String masterName);
    List<House> showAllHouses();
    House findHouseById(String houseId);
    void  houseUpdate(House house);
}
