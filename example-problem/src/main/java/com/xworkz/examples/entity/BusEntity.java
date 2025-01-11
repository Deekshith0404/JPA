package com.xworkz.examples.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@ToString
@Table(name = "busdetails")
public class BusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String route;
    private int bus_num;
    private int yearOld;
}
