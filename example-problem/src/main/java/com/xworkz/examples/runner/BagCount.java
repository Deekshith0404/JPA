package com.xworkz.examples.runner;

import com.xworkz.examples.entity.BagEntity;

import javax.persistence.*;

public class BagCount {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("example");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        Query query=entityManager.createNamedQuery("countAll");
        query.setParameter("name","puma");
        try {
            Long RED=(Long) query.getSingleResult();
            System.out.println(RED);
        } catch (NoResultException e) {
            System.err.println(e.getMessage());
        }
    }
}
