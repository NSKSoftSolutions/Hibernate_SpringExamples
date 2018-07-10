package com.nsksoft.spring.hibernate.client;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.bean.Likes;
import com.nsksoft.spring.hibernate.bean.Profile;
import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class AddProfileLikes {

	static Logger logger = Logger.getLogger(AddProfileLikes.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		logger.info("=========Executing the Main()=====================");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service = context.getBean(Service.class);
		logger.info("Creating an Object Of User and Setting the Values");

		Likes likes = new Likes();
		likes.setType_of_like("WOW");
		likes.setNo_of_likes(1);
		likes.setLiked_by("venkat Sai Thota");

		Set<Likes> likes_info = new HashSet<Likes>();
		likes_info.add(likes);

		Profile p = new Profile();
		p.setName("Akil");
		p.setLikes(likes_info);
		p.setUser_id("akhilmessi@gmail.com");

		service.addProfile_details(p);

	}

}
