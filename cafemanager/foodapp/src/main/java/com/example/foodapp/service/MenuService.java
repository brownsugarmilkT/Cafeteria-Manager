package com.example.foodapp.service;

import com.example.foodapp.entities.Menu;
import com.example.foodapp.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public Menu getMenuById(Long id) {
        return menuRepository.findById(id).orElse(null);
    }

    public List<Menu> getMenusByCafeteriaId(Long cafeteriaId) {
        return menuRepository.findByCafeteriaId(cafeteriaId);
    }

    public List<Menu> getMenusByFoodId(Long foodId) {
        return menuRepository.findByFoodId(foodId);
    }

    public List<Menu> getMenusByDay(DayOfWeek day) {
        return menuRepository.findByDay(day);
    }

    public List<Menu> getMenusByMealType(String mealType) {
        return menuRepository.findByMealType(mealType);
    }

    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }
}
