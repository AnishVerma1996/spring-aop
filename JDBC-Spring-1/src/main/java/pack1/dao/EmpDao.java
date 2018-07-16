package pack1.dao;

import java.util.List;
import java.util.Map;

public interface  EmpDao 
{
	int updateEmp(int empid,int sal);
	Map findEmpByTd(int empid);
	List findAllEmps();

}
