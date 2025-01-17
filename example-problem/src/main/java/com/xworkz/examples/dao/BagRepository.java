package com.xworkz.examples.dao;

import com.xworkz.examples.entity.BagEntity;

public interface BagRepository {
    boolean save(BagEntity bagEntity);
    BagEntity findById(int id);
    BagEntity findByName(String name);
    BagEntity updatelocation(String brand,int id);
}
