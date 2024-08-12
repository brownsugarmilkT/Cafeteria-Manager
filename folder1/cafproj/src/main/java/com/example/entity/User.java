package com.example.entity;
import java.util.Set;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String dietaryPreferences;

    @OneToMany(mappedBy = "user")
    private Set<Meal> meals;

    // Getters and Setters
}