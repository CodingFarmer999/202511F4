package com.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.course.config.AnnotationConfig;
import com.course.model.Benz;

public class AnnotationMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		for (String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		
		Benz car = ctx.getBean("benz", Benz.class);
		car.move();
		
	}

}
