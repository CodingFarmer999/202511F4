package com.course.dao.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.course.dto.BookDto;

@Mapper
public interface BookMapper {

	@Insert("INSERT INTO BOOK (NAME, AUTHOR, IMG_NAME, BUY_DATE) VALUES (#{name}, #{author}, #{imgName}, #{buyDate})")
	void insertBook(BookDto dto);
	
	@Update("UPDATE BOOK SET NAME = #{name}, AUTHOR = #{author} WHERE ID = #{id}")
	void updateBook(BookDto dto);
	
	@Delete("DELETE FROM BOOK WHERE ID = #{id}")
	void deleteById(Long id);
}
