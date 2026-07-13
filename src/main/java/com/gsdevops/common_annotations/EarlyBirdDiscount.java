package com.gsdevops.common_annotations;

public class EarlyBirdDiscount implements Discount {

	@Override
	public void issueDiscount() {
		System.out.println("Issuing early bird discount");
	}

}
