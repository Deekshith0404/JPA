package com.xwprkz.traffic.runner;

import javax.persistence.Persistence;

public class TrafficRunner {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("Traffic");
    }
}
