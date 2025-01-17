package com.xworkz.examples.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@Table(name = "bag")
@NamedQuery(name = "getallData",query = "select bag from BagEntity bag")
@NamedQuery(name = "getByName",query = "select bag from BagEntity bag where bag.brand=:name")
@NamedQuery(name = "countAll",query = "select count(bag) from BagEntity bag where bag.brand=:name")
@NamedQuery(name = "updatelocation",query = "update BagEntity bag set bag.brand=:brand where bag.id=:id")

public class BagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private int length;
    private int cost;
}
