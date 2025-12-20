package com.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.entity.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

	List<TodoEntity> findByTitle(String title);
	
	List<TodoEntity> findByStatus(Integer status);
	
	List<TodoEntity> findByTitleAndStatus(String title, Integer status);
	
}
