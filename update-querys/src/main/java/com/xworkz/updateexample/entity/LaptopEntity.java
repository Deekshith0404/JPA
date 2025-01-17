package com.xworkz.updateexample.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@Table(name = "laptop")
@NamedQuery(name = "update",query = "update LaptopEntity laptop set laptop.brand=:brand where laptop.id=:id")

public class LaptopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double cost;
    private String brand;
    private String processer;
}
