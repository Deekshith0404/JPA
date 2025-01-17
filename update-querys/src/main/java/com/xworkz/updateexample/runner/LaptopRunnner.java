package com.xworkz.updateexample.runner;

import com.xworkz.updateexample.entity.LaptopEntity;
import com.xworkz.updateexample.service.LaptopService;
import com.xworkz.updateexample.service.LaptopServiceImpl;

public class LaptopRunnner {
    private static LaptopService laptopService=new LaptopServiceImpl();

    public static void main(String[] args) {
//        LaptopEntity laptopEntity=new LaptopEntity(0,"macbook pro",140000.00,"apple","i7");

//        laptopService.save(laptopEntity);
        laptopService.updateBrand("vivo",2);
    }
}
