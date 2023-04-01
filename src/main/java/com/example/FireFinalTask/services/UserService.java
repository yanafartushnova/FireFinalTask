package com.example.FireFinalTask.services;

import com.example.FireFinalTask.domain.Role;
import com.example.FireFinalTask.domain.User;
import com.example.FireFinalTask.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;

public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserService() {}

    public String addUser(User user){
        User userFromDb = userRepo.findByUsername(user.getUsername());

        if (userFromDb != null) {
            return "User exists!";
        }

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);
        return "";
    }
}
