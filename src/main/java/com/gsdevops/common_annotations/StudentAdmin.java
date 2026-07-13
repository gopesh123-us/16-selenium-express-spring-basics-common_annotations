package com.gsdevops.common_annotations;

public class StudentAdmin implements Admin {

	@Override
	public void setClassSchedule() {
		System.out.println("Setting java class schedule.");
	}

}
