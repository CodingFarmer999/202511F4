package com.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.course.dao.TodoDao;
import com.course.entity.TodoEntity;
import com.course.repository.TodoRepository;

@Service
public class TodoService {

	private TodoRepository todoRepository;
	
	
//	private TodoDao todoDao;
	
//	public List<TodoEntity> findAll() {
//		return todoDao.findAll();
//	}
}
