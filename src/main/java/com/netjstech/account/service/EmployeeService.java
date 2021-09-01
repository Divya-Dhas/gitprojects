package com.netjstech.account.service;
import java.util.List;

import com.netjstech.account.dto.Employee;

public interface EmployeeService {
	public Employee getEmployeeById(int empId);
	public List<Employee>getEmployees();
	public List<Employee> getEmployeeByDept();
	public void deleteEmployee(int empId);

}
