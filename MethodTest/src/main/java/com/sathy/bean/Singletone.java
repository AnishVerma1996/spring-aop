package com.sathy.bean;

public abstract  class Singletone 
{
	public Singletone()
	{
	 System.out.println("costrautor:singletone" );
	}
	public abstract Prototype getInstance();
	public void recive()
	{
		System.out.println("recive()called");
		getInstance().store();
		
	}
	

}
