package com.netjstech.account.service;
import java.util.List; 
import com.netjstech.account.dao.EmployeeDao;
import com.netjstech.account.first.EmployeeDriver;
import com.nejstech.account.dao.EmployeeDaolmpl;
import com.netjstech.account.dao.Employee;
public class EmployeeServicelmpl implements EmployeeService {
		EmployeeDaolmpl empDao;
		public EmployeeServicelmpl(EmployeeDao empDao) {
			this.empDao = empDao;
		}
        public Employee getEmployeeById(int empId) {
        	Employee emp = empDao.findEmployeeById(empId);
        	return emp;
        }
        public List<EmployeeDriver> getEmployees(){
        	System.out.println("service- In getEmployees");
        	List<Employee> empList = empDao.getEmployees();
        	return empList;
        	
        }
        
        public List<Employee> getEmployeesByDept(){
        	return null;
        }
        
        public void deleteEmployee(int empId) {
        	Employee emp = empDao.findEmployeeById(empId);
        	if( emp != null) {
        		empDao.deleteEmployee(emp);
        	}
        	else
        	{
        		throw new IllegalArgumentException("Employee Id not found");
        	}
        	public void insertEmployeeWithValues() {
        		empDao.insertEmployeeWithValues();
        	}
}
