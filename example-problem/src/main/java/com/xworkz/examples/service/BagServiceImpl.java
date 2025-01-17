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

    @Override
    public BagEntity findById(int id) {
        BagEntity bag=bagRepository.findById(id);
        if (bag==null){
            System.out.println("id not avaialable");
        }else{
            System.out.println("found id:");
        }
        return bag;
    }

    @Override
    public BagEntity findByName(String name) {
        BagEntity bag=bagRepository.findByName(name);
        if (bag==null){
            System.out.println("data not found");
        }else{
            System.out.println("data found");
        }

        return bag;
    }

    @Override
    public void updateBrand(String brand, int id) {
        BagEntity bag=bagRepository.updatelocation(brand,id);
        if (bag!=null){
            System.out.println("found data:"+bag);
        }else {
            System.out.println("not found");
        }
    }
}
