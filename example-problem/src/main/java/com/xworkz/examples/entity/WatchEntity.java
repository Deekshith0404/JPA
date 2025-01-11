package com.xworkz.examples.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@Entity
@Data
@Table(name = "watch")
@ToString

public class WatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private int price;
    private String mfId;
}
