package com.webapp.rest.dao;

import java.util.ArrayList;
import java.util.List;

import com.webapp.rest.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getEmployees() {
		
		Employee e1=new Employee(101,"Roopam");
		Employee e2 =new Employee(102,"Jatin");
		
		List<Employee> lst=new ArrayList<Employee>();
		lst.add(e1);
		lst.add(e2);
		
		return lst;
	}

}
