package com.xworkz.examples.service;

import com.xworkz.examples.dao.BagRepository;
import com.xworkz.examples.dao.BagRepositoryImpl;
import com.xworkz.examples.entity.BagEntity;

public class BagServiceImpl implements BagService {
    private BagRepository bagRepository=new BagRepositoryImpl();

    @Override
    public void save(BagEntity bagEntity) {
        boolean result=bagRepository.save(bagEntity);
        if (result){
            System.out.println("data saved");
        }else {
            System.out.println("not saved");
        }
    }
}
