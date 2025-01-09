package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.PushpaHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PushpaRunner {
    public static void main(String[] args) {
        PushpaHotel pushpaHotel=new PushpaHotel();
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hotel");
         EntityManager entityManager=entityManagerFactory.createEntityManager();
         PushpaHotel ent=entityManager.find(PushpaHotel.class,6);
        System.out.println(ent);

        try {
            if (ent!= null) {
                ent.setArea("rameshwaram");
                ent.setC_number(45684262l);
                ent.setFamousfor("idli");
                ent.setLocation("manglore");
                ent.setPincode(789654);
                entityManager.getTransaction().begin();
                entityManager.merge(ent);
                entityManager.getTransaction().commit();
                entityManager.close();
            }
        }catch (Exception q){
            System.out.println(q.getMessage());
            entityManager.getTransaction().rollback();
        }




        entityManager.getTransaction().begin();
        entityManager.persist(pushpaHotel);
        entityManager.getTransaction().commit();
    }
}
