package com.nsksoft.spring.hibernate.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class GetDistinct_Brand_Details {

	public static void main(String sajjad[])
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service=context.getBean(Service.class);
		List list=service.getDistint_brands();
		     Object[] obj= list.toArray();
		     for(int i=0;i<obj.length;i++)
		     {
		    	 System.out.println(obj[i]);
		     }
	}
	
	
}
