package com.example.foodapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "foods")
public class Food {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "cafeteria_id", nullable = false)
    private Cafeteria cafeteria;

    private int calories;
    private int protein;
    private int fat;
    private int carbohydrates;
    private int fiber;
    private int sugar;
    private int sodium;
    private String type;

    public Food(/*Long id,*/ String name, int calories, int protein, int fat, int carbohydrates, int fiber, int sugar, int sodium, Cafeteria cafeteria, String type) {
        //this.id = id;
        this.name = name;
        this.cafeteria = cafeteria;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
        this.sugar = sugar;
        this.sodium = sodium;
        this.type = type;
    }

    public Food() {

    }

    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getFiber() {
        return fiber;
    }

    public void setFiber(int fiber) {
        this.fiber = fiber;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;

    }


}
