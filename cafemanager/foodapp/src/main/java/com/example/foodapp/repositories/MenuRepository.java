package com.example.foodapp.repositories;

import com.example.foodapp.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByCafeteriaId(Long cafeteriaId);

    List<Menu> findByFoodId(Long foodId);

    List<Menu> findByDay(DayOfWeek day);

    List<Menu> findByMealType(String mealType);

    List<Menu> findByCafeteriaIdAndDay(Long cafeteriaId, DayOfWeek day);
}
