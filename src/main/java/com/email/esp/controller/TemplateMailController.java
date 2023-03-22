package com.email.esp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class TemplateMailController {
	
	@GetMapping("/template")
	public String template() {
		return "user/template";
	}
}
