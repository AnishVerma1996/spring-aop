package com.sathya.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.bean.Mybean;

public class Test {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Mybean mybean=(Mybean)ctx.getBean("mybean");
		mybean.Show();
		ctx.close();

	}

}
