package com.gsdevops.common_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	
	@Value("${college.name}")
	private String collegeName;
	
	private Principal principal;
	
	private Teacher teacher;
	private Teacher substituteTeacher;
	
	@Autowired
	@Qualifier("earlyBirdDiscount")
	private Discount discount;
	
	@Autowired
	private Admin administrator;
	
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
		administrator.setClassSchedule();
		System.out.println("College name: " + this.collegeName);
		discount.issueDiscount();
		System.out.println("<<==== runCollege() ====>>\n");
	}
}
