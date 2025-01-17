package com.xworkz.updateexample.repository;

import com.xworkz.updateexample.entity.MobileEntity;

public interface MobileRepo {
    boolean save(MobileEntity mobileEntity);
    int UpdateBrand(String brand,int id);
}
