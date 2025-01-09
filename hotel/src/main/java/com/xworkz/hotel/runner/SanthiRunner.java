package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.SanthiHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SanthiRunner {
    public static void main(String[] args) {
        SanthiHotel santhiHotel=new SanthiHotel();
        santhiHotel.setId(7);
        santhiHotel.setOwner("Suresh");
        santhiHotel.setLocation("Delhi");
        santhiHotel.setC_number(9812345678L);
        santhiHotel.setType("veg");
        santhiHotel.setFamousfor("paneer tikka");
        santhiHotel.setPincode(110001);
        santhiHotel.setArea("Connaught Place");







        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hotel");
       EntityManager entityManager= entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
       entityManager.persist(santhiHotel);
       entityManager.getTransaction().commit();
    }
}
