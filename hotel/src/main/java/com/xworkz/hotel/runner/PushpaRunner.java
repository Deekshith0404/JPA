package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.PushpaHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PushpaRunner {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hotel");
         EntityManager entityManager=entityManagerFactory.createEntityManager();
         PushpaHotel ent=entityManager.find(PushpaHotel.class,5);
        PushpaHotel ent1=entityManager.find(PushpaHotel.class,4);
        PushpaHotel ent2=entityManager.find(PushpaHotel.class,1);
        PushpaHotel ent3=entityManager.find(PushpaHotel.class,3);
        PushpaHotel ent4=entityManager.find(PushpaHotel.class,6);
        System.out.println("data are "+ent);
        System.out.println("-------------------");
        System.out.println("data are "+ent1);
        System.out.println("-------------------");
        System.out.println("data are "+ent2);
        System.out.println("-------------------");
        System.out.println("data are "+ent3);
        System.out.println("-------------------");
        System.out.println("data are "+ent4);

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

    }
}
