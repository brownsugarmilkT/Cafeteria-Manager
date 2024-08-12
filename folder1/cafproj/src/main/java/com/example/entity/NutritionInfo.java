package com.example.entity;

import jakarta.persistence.*;

@Entity
public class NutritionInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nutrient;
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;

    // Getters and Setters
}
