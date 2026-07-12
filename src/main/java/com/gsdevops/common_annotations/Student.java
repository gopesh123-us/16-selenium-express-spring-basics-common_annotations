package com.gsdevops.common_annotations;

import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {
	public void markAttendence() {
		System.out.println("Present Sir!!");
	}
}
