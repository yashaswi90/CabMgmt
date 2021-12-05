package com.cab.management.CabManagement.entity;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cab_number;
    private String city_id;


}
