package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.SunanHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SunanRunner {
    public static void main(String[] args) {
      SunanHotel sunanHotel=new SunanHotel(1,"sanju","mangalore",458978985l,"veg","roti",458974,"thirdstreet");


        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(sunanHotel);
        entityManager.getTransaction().commit();
    }
}
