package com.course;

import com.course.model.Toyota;
import com.course.model.ToyotaEngine;

public class CarMain {

	public static void main(String[] args) {
		Toyota toyota = new Toyota(new ToyotaEngine());
		toyota.move();

	}

}
