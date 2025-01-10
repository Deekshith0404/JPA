package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.SanthiHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SanthiRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        SanthiHotel san=entityManager.find(SanthiHotel.class,5);
        System.out.println(san);
        System.out.println("------------------------------------");
        SanthiHotel san1=entityManager.find(SanthiHotel.class,3);
        System.out.println(san1);
        System.out.println("------------------------------------");
        SanthiHotel san2=entityManager.find(SanthiHotel.class,2);
        System.out.println(san2);
        System.out.println("------------------------------------");
        SanthiHotel san3=entityManager.find(SanthiHotel.class,6);
        System.out.println(san3);
        System.out.println("------------------------------------");
        SanthiHotel san4=entityManager.find(SanthiHotel.class,4);
        System.out.println(san4);
        System.out.println("------------------------------------");

        try {
            if (san!=null) {
                san.setType("veg");
                san.setPincode(456966);
                san.setFamousfor("palav");
                san.setC_number(4596692162l);
                san.setLocation("mandya");
                entityManager.getTransaction().begin();
                entityManager.merge(san);
                entityManager.getTransaction().commit();
                entityManager.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            entityManager.getTransaction().rollback();
        }







    }
}
