package com.xworkz.examples.runner;

import com.xworkz.examples.entity.BagEntity;
import com.xworkz.examples.service.BagService;
import com.xworkz.examples.service.BagServiceImpl;

public class BagIMPLRunner {
    public static void main(String[] args) {
        BagEntity bagEntity=new BagEntity(0,"ronaldo",25,25803);
        BagService bagService=new BagServiceImpl();
        bagService.save(bagEntity);
    }
}
