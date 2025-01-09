package com.xworkz.bag.runner;

import javax.persistence.Persistence;

public class BagRunner {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("Bag");
    }
}
