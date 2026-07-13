package com.gsdevops.common_annotations;

public class Computer {
	private String computerName;
	private CPU cpu;
	private Memory memory;
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	
	public void showSpecifications() {
		System.out.println("Computer: " + this.computerName);
		System.out.println("CPU: " + this.cpu.getModel());
		System.out.println("Speed: " + this.cpu.getSpeed() + " GHz");
		System.out.println("Memory: " + this.memory.getSize() + " GB " + this.memory.getType());
		
	}
	
}
