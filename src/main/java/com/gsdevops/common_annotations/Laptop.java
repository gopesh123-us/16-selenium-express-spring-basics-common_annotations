package com.gsdevops.common_annotations;

public class Laptop {
	private String laptopName;
	private Processor processor;

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void showConfiguration() {
		System.out.println("Laptop: " + this.laptopName);
		System.out.println("Processor: " + this.processor.getBrand());
		System.out.println("Cores: " + this.processor.getNumberOfCores());
	}
}
