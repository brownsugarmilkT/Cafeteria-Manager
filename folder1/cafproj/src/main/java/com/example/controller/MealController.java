package com.example.controller;

import com.example.entity.Meal;
import com.example.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meals")
public class MealController {

    @Autowired
    private MealService mealService;

    @PostMapping
    public ResponseEntity<Meal> createMeal(@RequestBody Meal meal) {
        return ResponseEntity.ok(mealService.saveMeal(meal));
    }

    @GetMapping
    public ResponseEntity<List<Meal>> getAllMeals() {
        return ResponseEntity.ok(mealService.getAllMeals());
    }
}
