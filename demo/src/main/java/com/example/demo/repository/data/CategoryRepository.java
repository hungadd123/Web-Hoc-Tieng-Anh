package com.example.demo.repository.data;

import com.example.demo.entity.data.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> { // Thay từ Long thành Integer
    Category findByName(String name);
}