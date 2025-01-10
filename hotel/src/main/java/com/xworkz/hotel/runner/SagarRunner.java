package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.SagarHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SagarRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        SagarHotel hot=entityManager.find(SagarHotel.class,2);
        System.out.println(hot);
        System.out.println("------------------------------------------");
        SagarHotel hot1=entityManager.find(SagarHotel.class,1);
        System.out.println(hot1);
        System.out.println("------------------------------------------");
        SagarHotel hot2=entityManager.find(SagarHotel.class,5);
        System.out.println(hot2);
        System.out.println("------------------------------------------");
        SagarHotel hot3=entityManager.find(SagarHotel.class,7);
        System.out.println(hot3);
        System.out.println("------------------------------------------");
        SagarHotel hot4=entityManager.find(SagarHotel.class,3);
        System.out.println(hot4);
        System.out.println("------------------------------------------");

        try {
            if (hot!=null) {
                hot.setType("veg");
                hot.setPincode(456966);
                hot.setFamousfor("palav");
                hot.setC_number(4596692162l);
                hot.setLocation("mandya");
                entityManager.getTransaction().begin();
                entityManager.merge(hot);
                entityManager.getTransaction().commit();
                entityManager.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            entityManager.getTransaction().rollback();
        }


    }
}
