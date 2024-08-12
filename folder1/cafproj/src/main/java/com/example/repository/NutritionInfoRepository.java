package com.example.repository;

import com.example.entity.NutritionInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionInfoRepository extends JpaRepository<NutritionInfo, Long> {
}