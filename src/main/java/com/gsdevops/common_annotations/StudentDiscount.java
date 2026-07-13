package com.gsdevops.common_annotations;

public class StudentDiscount implements Discount {

	@Override
	public void issueDiscount() {
		System.out.println("Issuing student discount");
	}

}
