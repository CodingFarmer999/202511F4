package com.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.course.dao.BookDao;
import com.course.dto.BookDto;

@Service
public class BookService {

	@Autowired
	@Qualifier("bookJdbcDaoImpl")
	private BookDao bookDao;
	
	public void addBook(BookDto dto) {
		bookDao.insertBook(dto);
	}
}
