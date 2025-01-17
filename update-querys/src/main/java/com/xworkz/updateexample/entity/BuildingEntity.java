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
@Table(name = "building")
@NamedQuery(name = "updatebr",query = "update BuildingEntity building set building.location=:location where building.id=:id")
@NamedQuery(name = "locationById",query = "select b.location from BuildingEntity b where b.id=:id")
@NamedQuery(name = "getlocAndName",query = "select new BuildingEntity (b.location,b.ownerName) from BuildingEntity b where b.id=:id")
public class BuildingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String location;
    private double areaSqft;
    private int pincode;
    private String ownerName;

    public BuildingEntity(String location, String ownerName) {
        this.location = location;
        this.ownerName = ownerName;
    }
}
