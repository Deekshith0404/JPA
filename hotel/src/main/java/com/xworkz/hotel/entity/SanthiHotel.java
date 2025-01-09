package com.xworkz.hotel.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "santhihotel")

public class SanthiHotel {
    @Id
    private int id;
    private String owner;
    private String location;
    private long c_number;
    private String type;
    private String famousfor;
    private int pincode;
    private String area;
}
