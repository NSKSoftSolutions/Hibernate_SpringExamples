package com.nsksoft.spring.hibernate.client;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.bean.User;
import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class GetUserdetails {

	static Logger logger = Logger.getLogger(GetUserdetails.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service = context.getBean(Service.class);
		List list = service.getUser();
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
 			User u = (User) obj;
            logger.info("First Name:"+u.getFirst_name());
            logger.info("Last Name:"+u.getLast_name());
            logger.info("Email:"+u.getEmail());
            logger.info("Mobile Number:"+u.getMobile());
           
            
		}
	}

}
