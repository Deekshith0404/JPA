package com.xworkz.examples.dao;

import com.xworkz.examples.entity.BagEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BagRepositoryImpl implements BagRepository{
    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("example");
    @Override
    public boolean save(BagEntity bagEntity) {
        EntityManager entityManager=emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(bagEntity);
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public BagEntity findById(int id) {
        EntityManager em=emf.createEntityManager();
        BagEntity bag=em.find(BagEntity.class,id);
        return bag;
    }

    @Override
    public BagEntity findByName(String name) {
        EntityManager em=emf.createEntityManager();
        Query query=em.createNamedQuery("getByName");
        query.setParameter("name",name);
        BagEntity bag=(BagEntity) query.getSingleResult();

        return bag;
    }

    @Override
    public BagEntity updatelocation(String brand, int id) {

        EntityManager entityManager=emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query=entityManager.createNamedQuery("updatelocation");
            query.setParameter("brand",brand);
            query.setParameter("id",id);
            query.executeUpdate();
            entityManager.getTransaction().commit();

            BagEntity bag=entityManager.find(BagEntity.class,id);
            return bag;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            return null;
        }finally {
            entityManager.close();
        }
    }
}
