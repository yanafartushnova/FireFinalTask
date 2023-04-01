package com.example.FireFinalTask.controller;

import com.example.FireFinalTask.domain.Role;
import com.example.FireFinalTask.domain.User;
import com.example.FireFinalTask.repos.UserRepo;
import com.example.FireFinalTask.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model) {
        UserService userService = new UserService();
        String addRes = userService.addUser(user);

        if (addRes == ""){
            return "redirect:/login";
        }

        else {
            model.put("message", addRes);
            return "registration";
        }
    }
}
