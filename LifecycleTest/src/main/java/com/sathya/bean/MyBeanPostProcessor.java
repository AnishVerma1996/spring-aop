package com.sathya.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		return bean;
	}

}
