package com.example.foodapp.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cafeteria_id", nullable = false)
    private Cafeteria cafeteria;

    @ManyToOne
    @JoinColumn(name = "food_id", nullable = false)
    private Food food;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private String day;

    @Column(nullable = false)
    private String mealType;

    // Constructors, Getters, Setters
    public Menu() {}

    public Menu(Cafeteria cafeteria, Food food, String day, String mealType) {
        this.cafeteria = cafeteria;
        this.food = food;
        this.day = day;
        this.mealType = mealType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public void setFoods(Food food) {
        this.food = food;
    }

}
