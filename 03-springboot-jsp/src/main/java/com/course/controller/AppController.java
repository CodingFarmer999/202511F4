package com.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/")
	public String home() {
		return "index2";
	}
	// URL: /login
	// @RequestMapping(value = "/login", method = RequestMethod.GET)
	@GetMapping("/login")
	public String login() {
		return "loginSuccess";
	}
	
}
