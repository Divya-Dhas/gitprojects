package com.nejstech.account.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.netjstech.account.dto.Employee;
public class EmployeeDaolmpl implements EmployeeDao {
	List<com.netjstech.account.dto.Employee> empList=new ArrayList<Employee>();
	public List<Employee> getEmployees()
	{
		System.out.println("Dao - in getEmployees");
		Employee employee=new Employee();
		employee.setEmpNo(1);
		employee.setEmpName("hemant");
		employee.setHireDate(LocalDate.of(2016, 07, 02));
		employee.setSalary(80000);
		employee.setJob("Developer");
		empList.add(employee);
		employee=new Employee();
		employee.setEmpNo(2);
		employee.setEmpName("varsha");
		employee.setHireDate(LocalDate.of(2016, 07, 02));
		employee.setSalary(10000);
		employee.setJob("Manager");
		empList.add(employee);
		return empList;
	}
	@Override
	public Employee findEmloyeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> findEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empList.remove(emp);
	}
	public void insertEmployeeWithValues() {
		Connection conn = null;
		try {
			conn = DBUtil.getDBConnection();
			String sql = "insert into emp values(?,?,?,?,?,?,)";
			
		preparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,.getEmpNo());
		pstmt.setString(2,e.getEmpName());
		
		pstmt.setString(3,e.getjob());
		pstmt.setInt(4,e.getDeptNo());
		pstmt.setDate(5, Date.valueOf(e.getHireDate()));
		
			Statement stmt =conn.createStatement();
			
			int count = stmt.executeUpdate("insert into emp values(9, 'sachin', 'sales','12-03-2012', 12000,4)");
			System.out.println("Record is inserted sucessfully!!" + count);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}

}
	@Override
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> findEmployeeByDept() {
		// TODO Auto-generated method stub
		return null;
	}

}
