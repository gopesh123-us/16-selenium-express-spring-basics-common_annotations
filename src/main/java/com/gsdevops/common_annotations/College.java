package com.gsdevops.common_annotations;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	
	private Principal principal;
	
	private Teacher teacher;
	private Teacher substituteTeacher;
	
	public void setTeacher(Teacher theTeacher) {
		this.teacher = theTeacher;
	}
	
	public void setSubstituteTeacher(Teacher substituteTeacher) {
		this.substituteTeacher = substituteTeacher;
	}
	
	
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}


	public College(Principal principal) {
		this.principal = principal;
	}

	public void runCollege() {
		System.out.println("<<==== runCollege() ====>>");
		System.out.println("Testing college class!!");
		principal.principalInfo();
		teacher.teach();
		substituteTeacher.teach();
		System.out.println("<<==== runCollege() ====>>\n");
	}
}
