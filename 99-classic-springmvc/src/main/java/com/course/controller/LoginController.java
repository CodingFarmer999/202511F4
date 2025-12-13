package com.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @Component
public class LoginController {
	// http://10.12.13.156/test/login
	@GetMapping("/login")
	public String login() {
		// WEB-INF/views/loginSuccess.jsp
		return "loginSuccess";
	}
}
