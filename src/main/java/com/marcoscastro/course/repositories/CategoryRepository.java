package com.marcoscastro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoscastro.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
