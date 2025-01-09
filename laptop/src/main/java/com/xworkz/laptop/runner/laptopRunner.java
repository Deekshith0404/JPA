package com.xworkz.laptop.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class laptopRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Laptop");
    }
}
