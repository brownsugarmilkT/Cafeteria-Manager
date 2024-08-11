package com.example.foodapp.entities;

public class FoodRequest {
    private String name;
    private int calories;
    private int protein;
    private int fat;
    private int carbohydrates;
    private int fiber;
    private int sugar;
    private int sodium;
    private Long cafeteriaId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getCafeteriaId() {
        return cafeteriaId;
    }

    public void setCafeteriaId(Long cafeteriaId) {
        this.cafeteriaId = cafeteriaId;
    }
}

