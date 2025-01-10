package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.NewGateHotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NewGateRunner {

    public static void main(String[] args) {
         EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hotel");
         EntityManager entityManager=entityManagerFactory.createEntityManager();
         NewGateHotel ent=entityManager.find(NewGateHotel.class,5);
        System.out.println(ent);
        System.out.println("-----------------------------------");
        NewGateHotel ent1=entityManager.find(NewGateHotel.class,2);
        System.out.println(ent1);
        System.out.println("-----------------------------------");
        NewGateHotel ent2=entityManager.find(NewGateHotel.class,6);
        System.out.println(ent2);
        System.out.println("-----------------------------------");
        NewGateHotel ent3=entityManager.find(NewGateHotel.class,7);
        System.out.println(ent3);
        System.out.println("-----------------------------------");
        NewGateHotel ent4=entityManager.find(NewGateHotel.class,8);
        System.out.println(ent4);


////        NewGateHotel newGateHotel=new NewGateHotel(1NewGateHotel newGateHotel5 = new NewGateHotel(6, "suresh", "delhi", 9234567890L, "veg", "paneer tikka", 110001, "fifth avenue");,"sujan","mangalore",4589625652l,"veg","roti",556936,"5th street");
//        NewGateHotel newGateHotel1 = new NewGateHotel(2, "rajesh", "bangalore", 9876543210L, "non-veg", "biryani", 560001, "1st avenue");
//        NewGateHotel newGateHotel2 = new NewGateHotel(3, "mira", "chennai", 9823456789L, "veg", "dosa", 600001, "second lane");
//        NewGateHotel newGateHotel3 = new NewGateHotel(4, "vijay", "hyderabad", 9123456789L, "non-veg", "kebab", 500001, "third cross");
//        NewGateHotel newGateHotel4 = new NewGateHotel(5, "anita", "mumbai", 9756478392L, "seafood", "prawns curry", 400001, "fourth street");
//NewGateHotel newGateHotel5 = new NewGateHotel(6, "suresh", "delhi", 9234567890L, "veg", "paneer tikka", 110001, "fifth avenue");
//        NewGateHotel newGateHotel6 = new NewGateHotel(7, "deepa", "pune", 9876543212L, "veg", "poha", 411001, "shivaji nagar");
//        NewGateHotel newGateHotel7 = new NewGateHotel(8, "arjun", "kolkata", 9456781230L, "non-veg", "fish curry", 700001, "park street");


//        NewGateHotel newGateHotel=new NewGateHotel();


        try {
            if (ent!=null) {
                ent.setOwner("raju");
                ent.setPincode(125647);
                ent.setLocation("bangalore");
                ent.setC_number(987456321l);
                ent.setType("veg");
                entityManager.getTransaction().begin();
                entityManager.merge(ent);
                entityManager.getTransaction().commit();
                entityManager.close();
                System.out.println("data updated");
            }else {
                System.out.println("data not updated");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            entityManager.getTransaction().rollback();
        }
//    if (ent!=null) {
//        entityManager.getTransaction().begin();
//        entityManager.remove(ent);
//        entityManager.getTransaction().commit();
//        System.out.println("deleted");
//    }else {
//        System.out.println("not deleted");
//    }
    }
}
