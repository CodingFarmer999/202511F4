package com.course.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.course.exception.ActionException;

@RestControllerAdvice
// @ControllerAdvice
public class GlobalControllerAdvice {
    // 日誌記錄器
    Logger logger = LoggerFactory.getLogger(GlobalControllerAdvice.class);
	
    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<String> handleException(Exception e) {
    	// 寫log
    	logger.error("我是Runtime Exception");
        return new ResponseEntity<>("系統忙碌中，請稍後再試", HttpStatus.OK);
    }
    
    @ExceptionHandler(value = {ActionException.class})
    public ResponseEntity<String> handleActionException(ActionException e) {
     	logger.error("我是ActionException");
        return new ResponseEntity<>("下班了，明天請早", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
