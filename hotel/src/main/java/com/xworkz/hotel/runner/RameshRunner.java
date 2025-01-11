package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.RameshEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RameshRunner {
    public static void main(String[] args) {
        RameshEntity rameshEntity=new RameshEntity(0,"manu","veg","mangalore");
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(rameshEntity);
        entityManager.getTransaction().commit();
    }
}
