package com.email.esp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class EmployeeListController {
	
	@GetMapping("/employee")
	public String employee() {
		return "user/employee";
	}
}
