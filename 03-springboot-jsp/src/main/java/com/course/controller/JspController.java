package com.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class JspController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@PostMapping(value = "/traditionRequest")
	public String traditionRequest(HttpServletRequest req) {
	    // 取得QueryString的參數值
	    String username = req.getParameter("username");
	    String password = req.getParameter("password");
	    
	    System.out.println("USERNAME:" + username);
	    System.out.println("PWD:" + password);
	    req.setAttribute("user", username);
	    return "loginSuccess";
	}
}
