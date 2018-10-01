package com.nsksoft.spring.hibernate.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.bean.User;
import com.nsksoft.spring.hibernate.configurations.Spring_Hibernate_Configurations;
import com.nsksoft.spring.hibernate.services.SpringServices;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Spring_Hibernate_Configurations.class);
		SpringServices services = context.getBean(SpringServices.class);
		
		User user=new User();
		user.setFirst_name("Prakash raj");
		user.setLast_name("Chiru");
		user.setMiddle_name("u");
		user.setEmail("prakash@gmail.com");
		user.setMobile_number(234567890);
		
		int i=services.add_User_details(user);
		if(i>0)
		{
			System.out.println("Values are Insertd");
			
		}
		else
		{
			
			System.out.println("Check the code once ");
		}
		
		
		
		
		

	}
}
