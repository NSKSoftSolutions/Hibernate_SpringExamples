package com.nsksoft.spring.hibernate.reposotires;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nsksoft.spring.hibernate.bean.User;

public class RepositoryImpl implements MyRepo {

	@Autowired
	SessionFactory factory;
	Session session;

	@Transactional
	public int add_user_information(User user) {
		// TODO Auto-generated method stub

		session = factory.openSession();
		int i = (Integer) session.save(user);
		return i;
	}

}
