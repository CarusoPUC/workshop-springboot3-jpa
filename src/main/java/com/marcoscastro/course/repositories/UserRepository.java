package com.marcoscastro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoscastro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
