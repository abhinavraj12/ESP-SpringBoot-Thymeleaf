package com.email.esp.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.email.esp.model.User;
import com.email.esp.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserControllerSecurity {
	
	@Autowired
	private UserRepository userRepository;
	
	@ModelAttribute
	private void userDetails(Model m, Principal p) {
		String email = p.getName();
		User user = userRepository.findByEmail(email);
		m.addAttribute("user", user);
	}
	
	@GetMapping("/")
	public String index() {
		return "user/index";
	}

}
