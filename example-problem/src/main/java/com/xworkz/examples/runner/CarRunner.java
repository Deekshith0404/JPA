package com.xworkz.examples.runner;

import com.xworkz.examples.entity.CarEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CarRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("example");
        EntityManager em=entityManagerFactory.createEntityManager();
        CarEntity carEntity=new CarEntity(0,"volvo",896589,25);
        CarEntity carEntity1=new CarEntity(0,"tata",45822,15);
        CarEntity carEntity2=new CarEntity(0,"gt",150000,21);
        CarEntity carEntity3=new CarEntity(0,"tata",789654,23);
        CarEntity carEntity4=new CarEntity(0,"volvo",884259,50);
        CarEntity carEntity5=new CarEntity(0,"bmw",896589,60);
        List<CarEntity> car=new ArrayList<>();
        car.add(carEntity);
        car.add(carEntity1);
        car.add(carEntity2);
        car.add(carEntity3);
        car.add(carEntity4);
        car.add(carEntity5);
        em.getTransaction().begin();
        car.stream().forEach(a->em.persist(a));
        em.getTransaction().commit();
    }
}
