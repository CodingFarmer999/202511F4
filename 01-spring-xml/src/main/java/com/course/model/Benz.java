package com.course.model;

import org.springframework.stereotype.Component;

@Component
public class Benz {
	
	private Engine engine;
	
	public Benz() {
		
	}
			
	public Benz(Engine engine) {
		this.engine = engine;
	}

	public void move() {
		engine.start();
		
		System.out.println("Benz move!!");
	}
}
