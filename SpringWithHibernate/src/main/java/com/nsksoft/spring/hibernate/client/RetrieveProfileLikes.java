package com.nsksoft.spring.hibernate.client;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.bean.Likes;
import com.nsksoft.spring.hibernate.bean.Profile;
import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class RetrieveProfileLikes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service = context.getBean(Service.class);
		List<String> list = service.getProfileLikes();
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object obj[] = (Object[]) itr.next();
			Profile p = (Profile) obj[0];
			System.out.println("Profile Name Of User:"+p.getName());
			Likes li = (Likes) obj[1];
			System.out.println("Liked By:" + li.getLiked_by());
			System.out.println("No_ofLikes:" + li.getNo_of_likes());
			System.out.println("Like type:" + li.getType_of_like());

			/*
			 * Set s=p.getLikes(); Iterator i=s.iterator(); while(i.hasNext()) { Object
			 * o=i.next();
			 * 
			 * }
			 *//*
				 * Set s1=p.getLikes(); Iterator itr1=s1.iterator(); while(itr1.hasNext()) {
				 * Object obj1=(Object)itr.next(); Likes l1=(Likes)obj1;
				 * System.out.println(l1.getLiked_by());
				 * System.out.println(l1.getType_of_like()); }
				 */
		}

	}

}
