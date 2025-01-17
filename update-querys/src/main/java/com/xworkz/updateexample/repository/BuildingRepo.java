package com.xworkz.updateexample.repository;

import com.xworkz.updateexample.entity.BuildingEntity;

public interface BuildingRepo {
    boolean save(BuildingEntity buildingEntity);
    int updateBrand(String location,int id);
    String locationById(int id);
    BuildingEntity locAndNME(int id);
}
