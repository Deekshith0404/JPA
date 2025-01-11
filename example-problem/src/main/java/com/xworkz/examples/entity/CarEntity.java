package com.xworkz.examples.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@ToString
@Table(name = "Car")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private int price;
    private int milage;
}
