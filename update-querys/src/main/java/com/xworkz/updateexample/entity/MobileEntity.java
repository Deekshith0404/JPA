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
@Table(name = "mobile")
@NamedQuery(name = "updatebrand",query = "update MobileEntity mobile set mobile.brand=:brand where mobile.id=:id")
public class MobileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String name;
    private double price;
}
