package com.email.esp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.email.esp.model.User;

import com.email.esp.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	 @GetMapping("/")
	 private String home() {
	 	return "home";
	 }
	 

	@GetMapping("/signin")
	private String login() {
		return "login";
	}

	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}

	@PostMapping("/createUser")
	public String createUser(@ModelAttribute User user, HttpSession session) {

		User eml = userService.checkEmail(user.getEmail());
		User phn = userService.checkPhone(user.getPhone());
		if (eml != null) {
			session.setAttribute("message", "This email id is already exist!");
			System.out.println("This email id is already exist!");

		} else if (phn != null) {
			session.setAttribute("message", "This mobile no. is already exist!");
			System.out.println("This mobile no. is already exist!");
		} else {
			User userObj = userService.createUser(user);
			if (userObj != null) {
				session.setAttribute("message", "Register Successfully!");
				System.out.println("Register Successfully!");
			} else {
				session.setAttribute("message", "Something went wrong!");
				System.out.println("Something went wrong!");
			}
		}
		return "redirect:/signup";
	}

}
