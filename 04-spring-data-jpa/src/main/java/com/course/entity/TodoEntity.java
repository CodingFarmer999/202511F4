package com.course.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "todo")
public class TodoEntity {

	@Id
	private Integer id;
	
	private String title;
	
	private Date duedate;
	
	private Integer status;
}
