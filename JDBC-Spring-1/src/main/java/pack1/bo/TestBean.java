package pack1.bo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack1.dao.EmpDao;

@Service
public class TestBean
{
	@Autowired
	private EmpDao dao;
	public void m1()
	{
		int i=dao.updateEmp(101,102);
		System.out.println(i+"row updated");
	}
	public void m2()
	{
		Map m=dao.findEmpByTd(106);
		System.out.println(m);
	}
	public void m3()
	{
		List l=dao.findAllEmps();
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Map m=(Map)it.next();
		
		System.out.println(l);
		}
	}
	

}
