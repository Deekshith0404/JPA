package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.SunanHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SunanRunner {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        SunanHotel sun=entityManager.find(SunanHotel.class,3);
        System.out.println(sun);
        System.out.println("-----------------------");
        SunanHotel sun1=entityManager.find(SunanHotel.class,4);
        System.out.println(sun1);
        System.out.println("-----------------------");
        SunanHotel sun2=entityManager.find(SunanHotel.class,5);
        System.out.println(sun2);
        System.out.println("-----------------------");
        SunanHotel sun3=entityManager.find(SunanHotel.class,1);
        System.out.println(sun3);
        System.out.println("-----------------------");
        SunanHotel sun4=entityManager.find(SunanHotel.class,7);
        System.out.println(sun4);
        System.out.println("-----------------------");

        try {
            if (sun!=null) {
                sun.setType("veg");
                sun.setPincode(456966);
                sun.setFamousfor("palav");
                sun.setC_number(4596692162l);
                sun.setLocation("mandya");
                entityManager.getTransaction().begin();
                entityManager.merge(sun);
                entityManager.getTransaction().commit();
                entityManager.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            entityManager.getTransaction().rollback();
        }
    }
}
