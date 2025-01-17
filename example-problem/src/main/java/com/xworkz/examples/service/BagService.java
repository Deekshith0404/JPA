package com.xworkz.examples.service;

import com.xworkz.examples.entity.BagEntity;

public interface BagService {
    void save(BagEntity bagEntity);
    BagEntity findById(int id);
    BagEntity findByName(String name);
    void updateBrand(String brand,int id);
}
