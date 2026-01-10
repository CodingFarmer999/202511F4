package com.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class RestfulController {

	@GetMapping("/hello")
	// @ResponseBody
	public String hello() {
		return "hello";
	}
}
