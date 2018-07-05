package com.nsksoft.spring.hibernate.client;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class App {
	static Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		logger.info("=========Executing the Main()=====================");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service = context.getBean(Service.class);
		/*logger.info("Creating an Object Of User and Setting the Values");
		User user = new User();
		user.setEmail("akil@gmail.com");
		user.setCountry("America");
		user.setDob("feb 28");
		user.setFirst_name("Akhil");
		user.setLast_name("Kumar");
		user.setGender("male");
		user.setMarital_status("married");
		user.setPassword("123456789");
		user.setMobile(987654321);
		user.setPermanent_adreess("Anantapur");
		user.setPresent_address("NewYork");
		user.setPincode("007");
		user.setState("United States Of America");
		logger.info("Calling the AddUser() method");
		service.adduser(user);
*/
	    service.getUserinfo(); 
	
	}
}
