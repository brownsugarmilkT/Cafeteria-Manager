package com.example.entity;
import java.util.Set;


import jakarta.persistence.*;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "meal")
    private Set<NutritionInfo> nutritionInfos;

    // Getters and Setters
}