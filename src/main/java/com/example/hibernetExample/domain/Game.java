package com.example.hibernetExample.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String name;
    @ManyToMany(mappedBy = "games")
    private List<User> user;
}
