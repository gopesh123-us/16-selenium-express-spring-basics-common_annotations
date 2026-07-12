package com.gsdevops.common_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.gsdevops.common_annotations" })
public class AppConfig {

	@Bean("colBean")
	public College collegeBean() {
		return new College(principalBean());
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
	
}
