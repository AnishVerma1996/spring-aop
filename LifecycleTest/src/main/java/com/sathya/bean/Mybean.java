package com.sathya.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Mybean implements BeanNameAware, ApplicationContextAware, DisposableBean, InitializingBean,BeanFactoryAware
{
	
	private String message;
	public void setMessage(String message)
	{
		this.message=message;
		
	}
	public  Mybean()
	{
		System.out.println("Object is created ");
	}
	
	public void afterPropertiesSet() throws Exception {
	

	}

	public void destroy() throws Exception 
	{
		System.out.println("destroy() is called");

	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException
	{
	System.out.println("setApplicationContext() is called");

	}

	public void setBeanName(String arg0) 
	{
		System.out.println("setBeanName() is called");

	}
	public void setUp()
	{
		System.out.println("custom init called");
	}
	public  void tearDown()
	{
		System.out.println("custom destory called");
		
	}
	public  void Show()
	{
		System.out.println("Show() is called");
	}
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("this is bean factory mmethod");
		
	}

}
