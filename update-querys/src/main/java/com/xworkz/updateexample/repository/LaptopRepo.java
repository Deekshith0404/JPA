package com.xworkz.updateexample.repository;

import com.xworkz.updateexample.entity.LaptopEntity;
import com.xworkz.updateexample.entity.MobileEntity;

public interface LaptopRepo {
    boolean save(LaptopEntity laptopEntity);
    int UpdateBrand(String brand,int id);
}
