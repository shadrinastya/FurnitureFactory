package com.example.springBoot.repository.v1;

import com.example.springBoot.model.v1.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}