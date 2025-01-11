package com.xworkz.examples.runner;

import com.xworkz.examples.entity.BagEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class BagRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("example");
        EntityManager em=entityManagerFactory.createEntityManager();
        BagEntity bagEntity=new BagEntity(0,"puma",2,1500);
        BagEntity bagEntity1=new BagEntity(0,"hp",1,500);
        BagEntity bagEntity2=new BagEntity(0,"puma",2,2500);
        BagEntity bagEntity3=new BagEntity(0,"wildcraft",1,700);
        BagEntity bagEntity4=new BagEntity(0,"hp",2,350);
        BagEntity bagEntity5=new BagEntity(0,"wildcraft",2,15000);

        List<BagEntity> list=new ArrayList<>();
        list.add(bagEntity);
        list.add(bagEntity1);
        list.add(bagEntity2);
        list.add(bagEntity3);
        list.add(bagEntity4);
        list.add(bagEntity5);

        em.getTransaction().begin();
        list.stream().forEach(a->em.persist(a));
        em.getTransaction().commit();

    }
}
