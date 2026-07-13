package com.gsdevops.common_annotations;

public class SubstituteTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am a substitue teacher for Math and English");
	}
}
