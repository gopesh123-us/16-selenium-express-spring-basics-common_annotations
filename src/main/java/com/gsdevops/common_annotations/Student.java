package com.gsdevops.common_annotations;

public class Student {

	private Subject subject;

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public void markAttendence() {
		System.out.println("Present Sir! I am a student of " + subject.getSubjectName());
	}
}
