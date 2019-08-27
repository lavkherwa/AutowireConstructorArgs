package com.example.autowire.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.example.autowire.service.Service1;
import com.example.autowire.service.Service2;

@Component
public class BeanFactory implements ApplicationContextAware {

	/* application context: holds reference to the bean factory */
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public Service2 getService2(final String input1, final String input2) {
		/* get the bean from the context after injecting constructor arguments */
		final Service2 bean = applicationContext.getBean(Service2.class, input1, input2);
		return bean;
	}

	public Service1 getService1() {
		/* get the singleton bean from the context */
		final Service1 bean = applicationContext.getBean(Service1.class);
		return bean;
	}
}
