package com.gsdevops.common_annotations;

public class Engine {
	
	private String engineType;

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return this.engineType;
	}	
	
}
