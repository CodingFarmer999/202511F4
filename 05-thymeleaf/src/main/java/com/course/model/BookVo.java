package com.course.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BookVo {

	private String name;
	
	@NotBlank
	private String author;
	
	private String imgName;
}
