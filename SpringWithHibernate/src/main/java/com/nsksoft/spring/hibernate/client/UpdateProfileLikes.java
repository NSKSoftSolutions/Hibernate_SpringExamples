package com.nsksoft.spring.hibernate.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class UpdateProfileLikes {
	public static void main(String kingkhan[]) {

		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service=context.getBean(Service.class);
		service.update_Profile_likes("navabsajjad.ali@gmail.com");
		
		
	}

}
