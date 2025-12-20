package com.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entity.UsersEntity;
import com.course.model.UserVo;
import com.course.repository.UsersRepository;

// @Component
@Service
public class LoginService {
	
	@Autowired
	private UsersRepository usersRepository;

	public boolean checkLogin(String username, String password) {
		// List<UsersEntity> users = usersRepository.findAll();
		UsersEntity user = usersRepository.findByUsername(username);
		
		if (user != null) {
			if (password.equals(user.getPassword())) {
				return true;
			}
		}
		
		return false;
//		if (username.equals("aaa") && password.equals("111")) {
//			return true;
//		} else {
//			return false;
//		}
	}
	
	public boolean registeUser(UserVo userVo) {
		System.out.println("Service:" + userVo);
		// 實際註冊行為
		
		// 註冊成功
		return true;

	}
}
