package com.example.foodapp.repositories;

import com.example.foodapp.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}

