package com.xworkz.updateexample.service;

import com.xworkz.updateexample.entity.LaptopEntity;

public interface LaptopService {
    void save(LaptopEntity laptopEntity);
    void updateBrand(String brand,int id);
}
