package com.gsdevops.common_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main class
 *
 */	


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	College college1 = context.getBean("colBean", College.class);
    	college1.runCollege();

    	Student std1 = context.getBean("stdBean", Student.class);
    	std1.markAttendence();
    	
    	   	
    	Car car = context.getBean("car", Car.class);
    	car.drive();
    	
    	Laptop laptop = context.getBean("laptopBean", Laptop.class);
    	laptop.showConfiguration();
    	
    	Computer computer = context.getBean("computerBean", Computer.class);
    	computer.showSpecifications();
    	((AnnotationConfigApplicationContext)context).close();
    }
}
