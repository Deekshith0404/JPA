package com.xworkz.examples.dao;

import com.xworkz.examples.entity.BagEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BagRepositoryImpl implements BagRepository{
    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("example");
    @Override
    public boolean save(BagEntity bagEntity) {
        EntityManager entityManager=emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(bagEntity);
        entityManager.getTransaction().commit();
        return true;
    }
}
