package com.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.course.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/login")
	public String login(String username, String password) {
		// TODO: 檢查是否登入成功
		return "loginSuccess";
	}
}
