package com.xworkz.examples.runner;

import com.xworkz.examples.entity.BusEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

public class BusRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("example");
        EntityManager em=entityManagerFactory.createEntityManager();
        BusEntity busEntity=new BusEntity(0,"45",1245,15);
        BusEntity busEntity1=new BusEntity(0,"721b",7896,9);
        BusEntity busEntity2=new BusEntity(0,"41s",8520,5);
        BusEntity busEntity3=new BusEntity(0,"23c",9638,3);
        BusEntity busEntity4=new BusEntity(0,"85f",4568,7);
        BusEntity busEntity5=new BusEntity(0,"sf4",2596,6);
        BusEntity busEntity6=new BusEntity(0,"700",9637,2);

        List<BusEntity> bs=new ArrayList<>();
        bs.add(busEntity);
        bs.add(busEntity1);
        bs.add(busEntity2);
        bs.add(busEntity3);
        bs.add(busEntity4);
        bs.add(busEntity5);
        bs.add(busEntity6);

        em.getTransaction().begin();
        for (BusEntity bus:bs) {
            em.persist(bus);
        }
        em.getTransaction().commit();

    }
}
