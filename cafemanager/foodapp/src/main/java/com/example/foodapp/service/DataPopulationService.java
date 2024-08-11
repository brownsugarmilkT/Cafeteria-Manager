package com.example.foodapp.service;

import com.example.foodapp.entities.Cafeteria;
import com.example.foodapp.entities.Food;
import com.example.foodapp.entities.Menu;
import com.example.foodapp.repositories.CafeteriaRepository;
import com.example.foodapp.repositories.FoodRepository;
import com.example.foodapp.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class DataPopulationService {

    @Autowired
    private CafeteriaRepository cafeteriaRepository;

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private MenuRepository menuRepository;

    @PostConstruct
    public void populateDatabase() {
        // Assuming Cafeteria is already in place
        Cafeteria rvcCafeteria = cafeteriaRepository.findById(1L).orElse(null);

        if (rvcCafeteria != null) {
            // Monday Breakfast Foods
            Food frenchToast = new Food( "French Toast", 400, 8, 8, 60, 2, 12, 350, rvcCafeteria, "Vegetarian");

            // Monday Lunch Foods
            Food vegetarianMacAndCheese = new Food("Vegetarian Mac & Cheese", 600, 20, 25, 70, 5, 10, 500, rvcCafeteria, "Vegetarian");
            Food veganMacAndCheese = new Food("Vegan Mac & Cheese", 550, 15, 20, 75, 6, 8, 450, rvcCafeteria, "Vegan");
            Food chickenFajitas = new Food("Chicken Fajitas", 700, 30, 25, 60, 3, 5, 400, rvcCafeteria, "Non Vegetarian");
            Food mexicanRice = new Food("Mexican Rice", 250, 5, 3, 50, 2, 1, 100, rvcCafeteria, "Vegan, Gluten Free");
            Food rosemaryBreadStick = new Food("Rosemary Bread Stick", 150, 4, 6, 20, 1, 2, 200, rvcCafeteria, "Vegan");

            // Monday Dinner Foods
            Food redCurryTofu = new Food("Red Curry Tofu", 450, 15, 20, 60, 5, 6, 350, rvcCafeteria, "Vegan, Gluten Free");
            Food chipotleLimeHaddock = new Food("Chipotle & Lime Haddock", 300, 25, 10, 20, 1, 1, 150, rvcCafeteria, "Gluten Free, Dairy Free, MSC");
            Food roastedHalalBBQChicken = new Food("Roasted Halal BBQ Chicken", 500, 35, 20, 30, 3, 4, 400, rvcCafeteria, "Gluten Free, Dairy Free, Halal");
            Food mashedPotatoesWithGarlic = new Food("Mashed Potatoes w/Garlic", 200, 3, 10, 30, 2, 1, 100, rvcCafeteria, "Vegan, Gluten Free");

            // Save the food items
            foodRepository.saveAll(Arrays.asList(
                    frenchToast,
                    vegetarianMacAndCheese,
                    veganMacAndCheese,
                    chickenFajitas,
                    mexicanRice,
                    rosemaryBreadStick,
                    redCurryTofu,
                    chipotleLimeHaddock,
                    roastedHalalBBQChicken,
                    mashedPotatoesWithGarlic
            ));

            // Monday Breakfast Menu
            Menu mondayBreakfastMenu = new Menu();
            mondayBreakfastMenu.setDay("Monday");
            mondayBreakfastMenu.setMealType("Breakfast");
            mondayBreakfastMenu.setCafeteria(rvcCafeteria);
            mondayBreakfastMenu.setFoods(Arrays.asList(frenchToast));
            menuRepository.save(mondayBreakfastMenu);

            // Monday Lunch Menu
            Menu mondayLunchMenu = new Menu();
            mondayLunchMenu.setDay("Monday");
            mondayLunchMenu.setMealType("Lunch");
            mondayLunchMenu.setCafeteria(rvcCafeteria);
            mondayLunchMenu.setFoods(Arrays.asList(
                    vegetarianMacAndCheese,
                    veganMacAndCheese,
                    chickenFajitas,
                    mexicanRice,
                    rosemaryBreadStick
            ));
            menuRepository.save(mondayLunchMenu);

            // Monday Dinner Menu
            Menu mondayDinnerMenu = new Menu();
            mondayDinnerMenu.setDay("Monday");
            mondayDinnerMenu.setMealType("Dinner");
            mondayDinnerMenu.setCafeteria(rvcCafeteria);
            mondayDinnerMenu.setFoods(Arrays.asList(
                    redCurryTofu,
                    chipotleLimeHaddock,
                    roastedHalalBBQChicken,
                    mashedPotatoesWithGarlic
            ));
            menuRepository.save(mondayDinnerMenu);
        }
    }
}
