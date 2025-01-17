package com.xworkz.updateexample.service;

import com.xworkz.updateexample.entity.MobileEntity;
import com.xworkz.updateexample.repository.MobileRepo;
import com.xworkz.updateexample.repository.MobileRepoImpl;

public class MobileServiceImpl implements MobileService{
    private MobileRepo mobileRepo=new MobileRepoImpl();
    @Override
    public void save(MobileEntity mobileEntity) {
        boolean result=mobileRepo.save(mobileEntity);
        if (result){
            System.out.println("data saved");
        }else {
            System.out.println("data not saved");
        }
    }

    @Override
    public void updateBrand(String brand, int id) {
        int result=mobileRepo.UpdateBrand(brand,id);
        if (result>=1){
            System.out.println("data updated");
        }else {
            System.out.println("not updated");
        }
    }
}
