package com.email.esp.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.email.esp.model.User;
import com.email.esp.repository.UserRepository;


@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    private String home() {
        return "home";
    }

    @GetMapping("/login")
    private String login() {
        return "login";
    }
    
    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user, HttpSession httpSession) {
        System.out.println(user);
        userRepository.save(user);
        httpSession.setAttribute("message", "User Register Successfully!");
        return "redirect:/login";
    }
  
}
