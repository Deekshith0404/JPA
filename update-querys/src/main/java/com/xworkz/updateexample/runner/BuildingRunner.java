package com.xworkz.updateexample.runner;

import com.xworkz.updateexample.entity.BuildingEntity;
import com.xworkz.updateexample.service.BuildingService;
import com.xworkz.updateexample.service.BuildingServiceImpl;

public class BuildingRunner {
   private static BuildingService buildingService=new BuildingServiceImpl();

    public static void main(String[] args) {
//        BuildingEntity buildingEntity=new BuildingEntity(0,"btm",250,568941,"ajay");
//        buildingService.save(buildingEntity);
//        buildingService.UpdateBrand("managalore",2);
//        buildingService.locById(2);
        buildingService.locAndName(2);
    }
}
