package com.xworkz.examples.runner;

import com.xworkz.examples.entity.BagEntity;

import javax.persistence.*;

public class getByName {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("example");
       EntityManager entityManager=entityManagerFactory.createEntityManager();
       Query query=entityManager.createNamedQuery("getByName");
       query.setParameter("name","sf");
        try {
            BagEntity bagEntity=(BagEntity) query.getSingleResult();
            System.out.println(bagEntity);
        } catch (NoResultException e) {
            System.err.println(e.getMessage());
        }
    }
}
