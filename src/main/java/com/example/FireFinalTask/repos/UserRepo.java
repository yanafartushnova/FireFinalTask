package com.example.FireFinalTask.repos;

import com.example.FireFinalTask.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}