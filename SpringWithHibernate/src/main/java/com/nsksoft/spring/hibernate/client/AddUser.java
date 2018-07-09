package com.nsksoft.spring.hibernate.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.bean.User;
import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class AddUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service = context.getBean(Service.class);
		User user = new User();
		user.setFirst_name("Navab");
		user.setLast_name("Shabeer Khan");
		user.setEmail("navabshabeer.khan@gmail.com");
		user.setMobile(831834645);
		user.setPassword("89765434567");

		service.adduser(user);

	}

}
