package com.xworkz.updateexample.service;

import com.xworkz.updateexample.entity.MobileEntity;

public interface MobileService {
    void save(MobileEntity mobileEntity);
    void updateBrand(String brand,int id);
}
