package com.xworkz.updateexample.service;

import com.xworkz.updateexample.entity.BuildingEntity;
import com.xworkz.updateexample.repository.BuildingRepo;
import com.xworkz.updateexample.repository.BuildingRepoImpl;

public class BuildingServiceImpl implements BuildingService{
    private static BuildingRepo buildingRepo=new BuildingRepoImpl();
    @Override
    public void save(BuildingEntity buildingEntity) {
            if (buildingRepo.save(buildingEntity)){
                System.out.println("data saved");
            }else {
                System.out.println("data not saved");
            }

    }

    @Override
    public void UpdateBrand(String location,int id) {

        int row=buildingRepo.updateBrand(location, id);
if (row>=1){
    System.out.println("data updated");
}else {
    System.out.println("not updated");
}
    }

    @Override
    public void locById(int id) {
        String loc=buildingRepo.locationById(id);
        if (loc!=null){
            System.out.println(loc);
        }else {
            System.out.println("data not found");
        }
    }

    @Override
    public void locAndName(int id) {
       BuildingEntity building= buildingRepo.locAndNME(id);
       if (building!=null){
           System.out.println("data found \n owner :"+building.getOwnerName()+"\t location :"+building.getLocation());
       }else {
           System.out.println("id not found");
       }
    }
}
