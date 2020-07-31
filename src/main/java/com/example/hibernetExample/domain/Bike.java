package com.example.hibernetExample.domain;

import javax.persistence.*;

@Entity
@Table(name = "bike")
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private int id;
    private String name;
    private String number;
    @OneToOne(mappedBy = "bike")
    private User user;
}
