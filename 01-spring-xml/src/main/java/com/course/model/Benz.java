package com.course.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Benz {
	
	private Engine engine;
			
	@Autowired
	public Benz(@Qualifier("kiaEngine") Engine engine) {
		this.engine = engine;
	}

	public void move() {
		engine.start();
		
		System.out.println("Benz move!!");
	}
}
