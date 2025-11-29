package com.course.model;

import org.springframework.stereotype.Component;

@Component
public class Bmw {
	
	private Engine engine;
	
	public Bmw() {
		
	}
			
	public Bmw(Engine engine) {
		this.engine = engine;
	}

	public void move() {
		engine.start();
		
		System.out.println("Bmw move!!");
	}
}
