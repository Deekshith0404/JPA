package com.xworkz.updateexample.runner;

import com.xworkz.updateexample.entity.MobileEntity;
import com.xworkz.updateexample.service.MobileService;
import com.xworkz.updateexample.service.MobileServiceImpl;

public class MobileRunner {
    public static void main(String[] args) {
        MobileService mobileService=new MobileServiceImpl();
//        MobileEntity mobileEntity=new MobileEntity(0,"oppo","lite 7",9000);
//        mobileService.save(mobileEntity);
        mobileService.updateBrand("redmi",2);
    }
}
