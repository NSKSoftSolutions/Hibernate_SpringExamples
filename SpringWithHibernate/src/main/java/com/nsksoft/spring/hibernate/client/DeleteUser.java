package com.nsksoft.spring.hibernate.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class DeleteUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext cotext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service=cotext.getBean(Service.class);
		service.deleteUser(2);
		
		
	}

}
