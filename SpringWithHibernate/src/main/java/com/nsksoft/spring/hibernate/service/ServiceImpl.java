package com.nsksoft.spring.hibernate.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.nsksoft.spring.hibernate.bean.User;
import com.nsksoft.spring.hibernate.repositry.Repositry;

@Component
public class ServiceImpl implements Service {

	@Autowired
	private Repositry springrepo;
	int i;

	@Transactional
	public int adduser(User user) {
		i = springrepo.save_user_detilas(user);
		return i;
	}

	public void getUser() {
		// TODO Auto-generated method stub

		List<String> user_details = springrepo.get_User_info();
		Iterator<String> itr = user_details.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			User u = (User) obj;
			System.out.println(u.getFirst_name());
			System.out.println(u.getEmail());

		}

	}

	public void getUserinfo() {
		// TODO Auto-generated method stub
	

		List<String> user_details = springrepo.get_User_info1();
		Iterator<String> itr = user_details.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			User u = (User) obj;
			System.out.println(u.getFirst_name());
			System.out.println(u.getEmail());

		}
		
	}

}
