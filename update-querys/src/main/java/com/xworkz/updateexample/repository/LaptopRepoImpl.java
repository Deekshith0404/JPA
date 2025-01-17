package com.xworkz.updateexample.repository;

import com.xworkz.updateexample.entity.LaptopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LaptopRepoImpl implements LaptopRepo{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("update");
    @Override
    public boolean save(LaptopEntity laptopEntity) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(laptopEntity);
            em.getTransaction().commit();
            return true;
        }catch (Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
            return false;
        }finally {
            if (em!=null){
                em.close();
            }
        }
    }

    @Override
    public int UpdateBrand(String brand, int id) {
        EntityManager entityManager=emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query=entityManager.createNamedQuery("update");
            query.setParameter("brand",brand);
            query.setParameter("id",id);
            int update=query.executeUpdate();
            entityManager.getTransaction().commit();
            return update;
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
            return 0;
        }finally {
            if (entityManager!=null){
                entityManager.close();
            }
        }
    }
}
