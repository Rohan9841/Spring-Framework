package com.rohan.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rohan.engine.Engine;

@Component
public class Car {
	
	@Autowired
	private Engine engine;
	
	public void printDetails() {
		System.out.println("Engine model: "+engine.getModel());
	}
}
