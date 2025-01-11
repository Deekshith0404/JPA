package com.xworkz.examples.runner;


import com.xworkz.examples.entity.TrafficEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class TrafficRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("example");
        EntityManager em= emf.createEntityManager();
        TrafficEntity trafficEntity=new TrafficEntity(0,false,25,"rajajinagar");
        TrafficEntity trafficEntity1=new TrafficEntity(0,true,3,"btm");
        TrafficEntity trafficEntity2=new TrafficEntity(0,false,2,"bhasyam");
        TrafficEntity trafficEntity3=new TrafficEntity(0,true,5,"mangalore");
        TrafficEntity trafficEntity4=new TrafficEntity(0,true,5,"madhur");
        TrafficEntity trafficEntity5=new TrafficEntity(0,false,8,"mandya");

        List<TrafficEntity> list=new ArrayList<>();
        list.add(trafficEntity);
        list.add(trafficEntity1);
        list.add(trafficEntity2);
        list.add(trafficEntity3);
        list.add(trafficEntity4);
        list.add(trafficEntity5);
        em.getTransaction().begin();
        list.stream().forEach(e-> em.persist(e));
        em.getTransaction().commit();


    }
}
