package com.example.securityexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/index")
    public String getHomepage(){
        return "Ana sayfaya hosgeldin";
    }

    @GetMapping("/dashboard")
    public String loginDashboard(){
        return "users can see this page";
    }
}
