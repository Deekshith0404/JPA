package com.xworkz.updateexample.repository;

import com.xworkz.updateexample.entity.BuildingEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.Map;

public class BuildingRepoImpl implements BuildingRepo{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("update");
    @Override
    public boolean save(BuildingEntity buildingEntity) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(buildingEntity);
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
    public int updateBrand(String location, int id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updatebr");
            query.setParameter("location", location);
            query.setParameter("id", id);
            int update = query.executeUpdate();
            entityManager.getTransaction().commit();
            return update;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
            return 0;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    @Override
    public String locationById(int id) {
        EntityManager em=emf.createEntityManager();

        try {
            Query q=em.createNamedQuery("locationById");
            q.setParameter("id",id);
            String result=(String) q.getSingleResult();
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public BuildingEntity locAndNME(int id) {
        EntityManager em=emf.createEntityManager();
        try {
            Query query=em.createNamedQuery("getlocAndName");
            query.setParameter("id",id);
            BuildingEntity building=(BuildingEntity) query.getSingleResult();
            return building;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }
}
