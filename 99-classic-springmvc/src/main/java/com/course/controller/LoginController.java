package com.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @Component
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "loginSuccess";
	}
}
