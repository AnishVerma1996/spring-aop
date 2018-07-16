package com.sathya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathy.bean.Singletone;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean object
		Singletone singletone=(Singletone)ctx.getBean("s");
		singletone.recive();
		System.out.println("=========================");
		
		singletone.recive();
		
		
	

	}

}
