package com.xworkz.examples.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;


@AllArgsConstructor
@Entity
@Data
@Table(name = "trafficdetails")
@ToString

public class TrafficEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isTrafficGreen;
    private int numberOfVehicals;
    private String location;
}
