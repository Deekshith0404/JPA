package com.xworkz.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@ToString
@Table(name = "ramesh")
@Data
public class RameshEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    private String location;
}
