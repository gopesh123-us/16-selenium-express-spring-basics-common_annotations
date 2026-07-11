package com.gsdevops.common_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public College collegeBean() {
		return new College();
	}
	
}
