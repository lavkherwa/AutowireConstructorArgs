package com.example.autowire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.autowire.beans.BeanFactory;
import com.example.autowire.service.Service2;

@RestController
@RequestMapping("/api")
public class Api {

	final private BeanFactory beanFactory;

	/* Dependency injection using constructor */
	Api(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

	@GetMapping("/service1")
	public String getService1() {
		return beanFactory.getService1().getServiceName();
	}

	@GetMapping("/service2")
	public String getService2() {

		/* Request factory to provide this object */
		Service2 service2 = beanFactory.getService2("First constructor arg", "Second constructor arg");
		return service2.toString();
	}

}
