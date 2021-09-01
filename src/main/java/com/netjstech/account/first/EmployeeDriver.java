package com.netjstech.account.first;
import java.util.List;

import com.netjstech.account.service.EmployeeServicelmpl;
import com.nejstech.account.dao.EmployeeDao;
import  com.netjstech.account.dto.Employee;
import com.netjstech.account.service.EmployeeService;


public class EmployeeDriver {
	Employee emp;
	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDao();
		EmployeeServicelmpl employeeService =new EmployeeServicelmpl(employeeDao);
		
		employeeService.insertEmployeeWithValues();
		List<Employee>emplist=employeeService.getEmployees();
		System.out.println("Back with Employee List - "+emplist.size());
		for(Employee employee:emplist)
		{
			System.out.println(employee);
		}
		
	}
}

