package sbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pack1.AppConfig;
import com.pack1.Demo;

public class Main
{
	public static void main(String[]arg)
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(com.pack1.AppConfig.class);
		Demo db=(Demo)ctx.getBean("demoBean");
		try
		{
			db.method1();
			System.out.println("transaction successfull");
		}
		catch(Exception e)
		{
			System.out.println("transaction failed"+e);
		}
	}
}
