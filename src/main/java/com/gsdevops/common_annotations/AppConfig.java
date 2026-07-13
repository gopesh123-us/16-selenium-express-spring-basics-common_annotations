package com.gsdevops.common_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean("colBean")
	public College collegeBean() {
		College college = new College(principalBean());
		college.setTeacher(teacherBean());
		college.setSubstituteTeacher(substituteTeacher());
		return college;
	}

	@Bean("stdBean")
	public Student studentBean() {
		Student student = new Student();
		student.setSubject(subjectBean());
		return student;
	}	
	
	@Bean("principal")
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean("subject")
	public Subject subjectBean() {
		Subject subject = new Subject();
		subject.setSubjectName("Physics");
		return subject;
	}
	
	@Bean("car")
	public Car carBean() {
		Car car = new Car();
		car.setEngine(engineBean());
		return car;		
	}
	
	@Bean("engine")
	public Engine engineBean() {
		Engine engine = new Engine();
		engine.setEngineType("Electric");
		return engine;
		
	}
	
	@Bean
	public Laptop laptopBean() {
		Laptop laptop = new Laptop();
		laptop.setLaptopName("ThinkPad");
		laptop.setProcessor(processorBean());
		return laptop;
	}
	
	@Bean
	public Processor processorBean() {
		Processor processor = new Processor();
		processor.setBrand("Intel");
		processor.setNumberOfCores(8);
		return processor;
	}
	
	@Bean
	public Computer computerBean() {
		Computer computer = new Computer();
		computer.setComputerName("Development Machine");
		computer.setCpu(cpuBean());
		computer.setMemory(memoryBean());
		return computer;
	}
	
	@Bean
	public CPU cpuBean() {
		CPU cpu = new CPU();
		cpu.setModel("Ryzen 7");
		cpu.setSpeed(4.5);
		return cpu;
	}
	
	@Bean
	public Memory memoryBean() {
		Memory memory = new Memory();
		memory.setSize(32);
		memory.setType("DDR5");
		return memory;
	}
	
	@Bean
	public Teacher teacherBean() {
		Teacher teacher = new MathTeacher();
		return teacher;
	}	
	
	public Teacher substituteTeacher() {
		Teacher subteacher = new SubstituteTeacher();
		return subteacher;
	}
	
}
