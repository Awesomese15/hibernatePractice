package com.example.hibernetExample.domain;

import javax.persistence.*;

@Entity
@Table (name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String street;
    private String city;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn( name="user_id", nullable = false)
    private User user;

    public Address(int id, String street, String city) {
        this.id = id;
        this.street = street;
        this.city = city;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
