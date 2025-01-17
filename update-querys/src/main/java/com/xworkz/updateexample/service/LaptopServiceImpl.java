package com.xworkz.updateexample.service;

import com.xworkz.updateexample.entity.LaptopEntity;
import com.xworkz.updateexample.repository.LaptopRepo;
import com.xworkz.updateexample.repository.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService{
    private  LaptopRepo laptopRepo=new LaptopRepoImpl();
    @Override
    public void save(LaptopEntity laptopEntity) {
        boolean result=laptopRepo.save(laptopEntity);
        if (result){
            System.out.println("data saved");
        }else {
            System.out.println("data not saved");
        }
    }

    @Override
    public void updateBrand(String brand, int id) {
        int update=laptopRepo.UpdateBrand(brand,id);
        if (update>=1){
            System.out.println("data updated");
        }else {
            System.out.println("data not updated");
        }

    }
}
