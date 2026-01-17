package com.course.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.course.dao.BookDao;
import com.course.dto.BookDto;

@Repository
public class BookJdbcDaoImpl implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertBook(BookDto dto) {
		String sql = "INSERT INTO BOOK (NAME, AUTHOR, IMG_NAME, BUY_DATE) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, dto.getName(), dto.getAuthor(), dto.getImgName(), dto.getBuyDate());
	}

	@Override
	public List<BookDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBookById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
