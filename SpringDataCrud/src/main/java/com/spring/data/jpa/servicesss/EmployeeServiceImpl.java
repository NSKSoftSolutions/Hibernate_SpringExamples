package com.spring.data.jpa.servicesss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.data.jpa.bean.Employee;
import com.spring.data.jpa.repos.EmployeeRepositorie;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepositorie employeeRepositorie;

	public void addEmployee(Employee emp) {

		employeeRepositorie.saveAndFlush(emp);

	}

	public List<Employee> getEmployee_by_Name(String name) {

		List<Employee> emp = employeeRepositorie.findByName(name);

		return emp;
	}

	public List<Employee> findByEidAndName(int i, String string) {
		List<Employee> employees = employeeRepositorie.findByEidAndName(i, string);

		return employees;
	}

	public void updateEmployee(String name,int eid) {
	
		
		employeeRepositorie.update_employee(name,eid);
		
	}

}
