package com.xworkz.examples.runner;

import com.xworkz.examples.entity.BagEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BagRunnerGetAll {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("example");
        EntityManager em=entityManagerFactory.createEntityManager();
        Query getall=em.createNamedQuery("getallData");
        List<BagEntity> list=(List<BagEntity>)getall.getResultList();
        for (BagEntity bag:list){
            System.out.println(list);
        }
    }
}
