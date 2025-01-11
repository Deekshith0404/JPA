package com.xworkz.examples.runner;

import com.xworkz.examples.entity.WatchEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class WatchRunner {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager em = entityManagerFactory.createEntityManager();
        WatchEntity watchEntity = new WatchEntity(0, "rolls", 50000, "hjs45");
        WatchEntity watchEntity1 = new WatchEntity(0, "rolls", 50000, "hjs45");
        WatchEntity watchEntity2 = new WatchEntity(0, "rolls", 50000, "hjs45");
        WatchEntity watchEntity3 = new WatchEntity(0, "rolls", 50000, "hjs45");
        WatchEntity watchEntity4 = new WatchEntity(0, "rolls", 50000, "hjs45");
        WatchEntity watchEntity5 = new WatchEntity(0, "rolls", 50000, "hjs45");
        List<WatchEntity> watchlist = new ArrayList<>();
        watchlist.add(watchEntity);
        watchlist.add(watchEntity1);
        watchlist.add(watchEntity2);
        watchlist.add(watchEntity3);
        watchlist.add(watchEntity4);
        watchlist.add(watchEntity5);
        em.getTransaction().begin();
        watchlist.stream().forEach(e->em.persist(e));
        em.getTransaction().commit();
    }
}
