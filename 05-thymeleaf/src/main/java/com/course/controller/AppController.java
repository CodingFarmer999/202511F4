package com.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "<span style=\"color:DodgerBlue;\">去唱卡拉ＯＫ吧</span>");
		
		model.addAttribute("title2", "<script>alert('你被攻擊了')</script>");
		
		model.addAttribute("param1", "半邊天");
		
		model.addAttribute("param2", "福利蓮");
		return "app";
	}
	
	public String test() {
		String t = """
				
				""";
		
		return t;
	}
}
