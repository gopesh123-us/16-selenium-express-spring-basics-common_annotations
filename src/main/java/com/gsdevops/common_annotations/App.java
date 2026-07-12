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
    	College college = context.getBean("collegeBean", College.class);
    	college.test();
    	
    	College college1 = context.getBean("colBean", College.class);
    	college1.test();

    	Student std1 = context.getBean("stdBean", Student.class);
    	std1.markAttendence();
    	
    	SubstituteTeacher sub = context.getBean("substituteTeacher", SubstituteTeacher.class);
    	sub.getSubject();
    	
    	Car car = context.getBean("car", Car.class);
    	car.drive();
    	
    	Laptop laptop = context.getBean("laptopBean", Laptop.class);
    	laptop.showConfiguration();
    	
    	((AnnotationConfigApplicationContext)context).close();
    }
}
