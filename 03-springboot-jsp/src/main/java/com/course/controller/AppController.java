package com.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	// URL: /login
	@RequestMapping("/login")
	public String login() {
		return "loginSuccess";
	}
	
}
