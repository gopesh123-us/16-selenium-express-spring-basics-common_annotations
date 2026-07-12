package com.gsdevops.common_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.gsdevops.common_annotations" })
public class AppConfig {

	@Bean("colBean")
	public College collegeBean() {
		return new College(principalBean());
	}

	@Bean("stdBean")
	public Student studentBean() {
		return new Student();
	}
	
	@Bean("principal")
	public Principal principalBean() {
		return new Principal();
	}

}
