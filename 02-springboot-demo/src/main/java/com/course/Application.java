package com.course;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.course.model.Toyota;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(Application.class);
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
//		for (String name : ctx.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
		
		logger.trace("TRACE");
		logger.debug("DEBUG");
		logger.info("開始測試小車車");
		logger.warn("WARN");
		logger.error("ERROR");
		
		String errerMessage = "出事了~~~~~";
		logger.error("ERROR, {}, xxxx={}", errerMessage, "TEST");
		
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			logger.error("FileNotFoundException", e);
		}
		Toyota car = ctx.getBean(Toyota.class);
		car.move();
	}

}
