package com.xworkz.project.runner;

import javax.persistence.Persistence;

public class ProjectRunner {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("Projecter");
    }
}
