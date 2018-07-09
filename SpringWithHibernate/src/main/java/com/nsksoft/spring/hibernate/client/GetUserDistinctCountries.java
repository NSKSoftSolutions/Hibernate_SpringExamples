package com.nsksoft.spring.hibernate.client;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class GetUserDistinctCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service = context.getBean(Service.class);
		List<String> result = service.getDistinctCountriesByUser();
		Iterator itr = result.iterator();
		while (itr.hasNext()) {
			String obj = (String) itr.next();
			System.out.println(obj);

		}

	}

}
