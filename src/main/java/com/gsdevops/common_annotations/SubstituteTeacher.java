package com.gsdevops.common_annotations;

public class SubstituteTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am a Substitue teacher for Math and English");
	}
}
