package com.spring;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Work 
{
	@Scheduled(fixedRate=10000)
	public void doWork()
	{
	 System.out.println("Hello....." );
		
	}

	
}
