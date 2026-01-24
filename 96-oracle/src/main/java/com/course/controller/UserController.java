package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.entity.UserEntity;
import com.course.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/users")
	public List<UserEntity> findAll() {
		return repo.findAll();
	}
	
	@PostMapping("/user")
	public void insertUser(UserEntity user) {
		repo.save(user);
	}
	
}
