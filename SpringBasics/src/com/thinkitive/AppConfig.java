package com.thinkitive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	@Scope(scopeName = "prototype")
	public Employee getEmployee() {
		return new Employee(1, "aaa", 99000);
	}

	@Bean
	public Address getAddress() {
		return new Address(411028, "Pune");
	}

}
