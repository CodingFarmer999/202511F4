package com.course.model;

public class Toyota {
	
	private ToyotaEngine engine;
	
	public Toyota(ToyotaEngine engine) {
		this.engine = engine;
	}

	public void move() {
		// ToyotaEngine engine = new ToyotaEngine();
		engine.start();
		
		System.out.println("Toyota move!!");
	}
}
