package com.spring.data.jpa.presentaion_layer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.data.jpa.bean.Employee;
import com.spring.data.jpa.servicesss.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
		EmployeeService service = context.getBean(EmployeeService.class);
	   /* Employee emp=new Employee(7, "sajjad");
		service.addEmployee(emp);*/
	/*	
		List<Employee> employee_details = service.getEmployee_by_Name("sajjad");
		for (Employee e : employee_details) {
			System.out.println(e);
		}
*/
	/*	List<Employee> emp=service.findByEidAndName(7,"sajjad");
		for(Employee e:emp)
		{
			System.out.println(e);
			
		}*/
		
		service.updateEmployee("Sajjad alikhan",7);
		
		
		
	}
}
