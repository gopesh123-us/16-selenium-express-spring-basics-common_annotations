package com.gsdevops.common_annotations;

public class Car {
	
	private Engine engine;
	
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		System.out.println("Driving with " + engine.getEngineType() + " engine");
	}	
}
