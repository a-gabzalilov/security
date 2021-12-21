package com.example.security.controllers;

import com.example.security.repo.Users_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private Users_repository UR;

    @GetMapping("/")
    public String home(Model model){
        return "home";
    }
}
