package com.course.entity;

import java.util.Date;

import lombok.Data;

@Data
public class BookEntity {
	
	private Long id;
	
	private String name;
	
	private String author;
	
	private Date buyDate;
	
	private String imgName;
}
