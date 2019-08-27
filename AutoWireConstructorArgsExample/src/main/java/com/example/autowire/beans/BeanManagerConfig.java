package com.example.autowire.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.autowire.service.Service1;
import com.example.autowire.service.Service2;

@Configuration
public class BeanManagerConfig {

	/*
	 * We got to return a dummy bean and factory will take care of injecting the
	 * parameters to this bean
	 */
	@Bean
	@Scope("prototype") // Singleton is not possible for Classes with constructors [Obvious thing!]
	public Service2 service2(String input1, String input2) {
		Service2 service2 = new Service2(input1, input2);
		return service2;
	}

	@Bean
	public Service1 service1() {
		return new Service1();
	}

}
