package com.nsksoft.spring.hibernate.repositry;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nsksoft.spring.hibernate.bean.User;
import com.nsksoft.spring.hibernate.hqlquery.HQLConstants;

@Component
public class SpringRepositry implements Repositry {

	@Autowired
	SessionFactory factory;

	/*
	 * @Transactional public void adduser(User user) { // TODO Auto-generated method
	 * stub Session session = factory.openSession(); session.saveOrUpdate(user);
	 * System.out.println("Object Saved Successfully"); }
	 */
	int result;

	public int save_user_detilas(User user) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		result = (Integer) session.save(user);
		System.out.println("Object Saved Successfully");
		return result;

	}

	public List<String> get_User_info() {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Query<String> query = session.createQuery(HQLConstants.Retrieve_User_details);
		List<String> user_details = query.list();

		return user_details;
	}

	public List<String> get_User_info1() {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Query<String> query = session.createQuery(HQLConstants.Retrieve_User_details);
		List<String> user_details = query.list();

		return user_details;

	}

}
