package com.course.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entity.BookEntity;
import com.course.model.BookVo;
import com.course.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	public List<BookVo> getAllBook() {
		List<BookEntity> books = bookRepo.findAll();
		// Entity -> Vo
		
		return books.stream().map(entity -> convertToVo(entity)).collect(Collectors.toList());
		
//		List<BookVo> voList = new ArrayList<>();
//		for (BookEntity entity : books) {
//			BookVo vo = convertToVo(entity);
//			voList.add(vo);
//		}

//		return voList;
	}
	
	public void deleteBookById(Long id) {
		bookRepo.deleteById(id);
	}
	
	public void insertBook(BookVo book) {
		// 轉成 Entity
		BookEntity entity = new BookEntity();
		// 存進 DB
		entity.setName(book.getName());
		entity.setAuthor(book.getAuthor());
		entity.setBuyDate(parseDate(book.getBuyDate()));
		entity.setImgName("XXXX");
		bookRepo.save(entity);
		
		
	}
	
	public BookVo convertToVo(BookEntity entity) {
		BookVo vo = new BookVo();
		vo.setId(entity.getId());
		vo.setName(entity.getName());
		vo.setAuthor(entity.getAuthor());
		vo.setBuyDate(parseDateToString(entity.getBuyDate()));
		vo.setImgName(entity.getImgName());
		return vo;
	}
	
	public String parseDateToString(Date date) {
	    // 定義日期格式
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	   // 將 Date 物件轉換為 String
	   return formatter.format(date);
	}
	
	/**
	 * 轉換日期
	 * @param dueDateStr
	 * @return
	 */
	public Date parseDate(String dueDateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return formatter.parse(dueDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
	}
}
