package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.SagarHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SagarRunner {
    public static void main(String[] args) {
        SagarHotel sagarHotel=new SagarHotel();
        sagarHotel.setId(8);
        sagarHotel.setOwner("Deepa");
        sagarHotel.setLocation("Hyderabad");
        sagarHotel.setC_number(9988776655L);
        sagarHotel.setType("veg");
        sagarHotel.setFamousfor("paneer butter masala");
        sagarHotel.setPincode(500001);
        sagarHotel.setArea("rooftop");







        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(sagarHotel);
        entityManager.getTransaction().commit();

    }
}
