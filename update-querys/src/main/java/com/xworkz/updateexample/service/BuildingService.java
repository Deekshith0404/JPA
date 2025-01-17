package com.xworkz.updateexample.service;

import com.xworkz.updateexample.entity.BuildingEntity;

public interface BuildingService {
    void save(BuildingEntity buildingEntity);
    void UpdateBrand(String location,int id);
    void locById(int id);
    void locAndName(int id);
}
