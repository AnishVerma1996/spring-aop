package com.pack1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DemoBean implements Demo 
{
	@Autowired
	private JdbcTemplate jt;
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.SERIALIZABLE,timeout=60)
	public void method1() 
	{
		jt.update("insert into dept values(50,'Reaserch','MUM')");
		jt.update("update emp set sal=10000 where deptno=20");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		jt.update("delete from sathya where id=111");
	}

}
