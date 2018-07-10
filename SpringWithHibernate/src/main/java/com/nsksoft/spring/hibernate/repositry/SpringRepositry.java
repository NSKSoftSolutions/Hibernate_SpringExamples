package com.nsksoft.spring.hibernate.repositry;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nsksoft.spring.hibernate.bean.Category;
import com.nsksoft.spring.hibernate.bean.Profile;
import com.nsksoft.spring.hibernate.bean.User;
import com.nsksoft.spring.hibernate.hqlquery.HQLConstants;

@Component
public class SpringRepositry implements Repositry {

	@Autowired
	SessionFactory factory;

	public static String update_first_name;

	/*
	 * @Transactional public void adduser(User user) { // TODO Auto-generated method
	 * stub Session session = factory.openSession(); session.saveOrUpdate(user);
	 * System.out.println("Object Saved Successfully"); }
	 */
	int result;

	public int save_user_detilas(User user) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		result = (Integer) session.save(user);
		System.out.println("Object Saved Successfully");
		return result;

	}

	public List<String> get_User_info() {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Query query = session.createQuery(HQLConstants.Retrieve_User_details);
		List<String> user_details = query.getResultList();

		return user_details;
	}

	public List<String> getDiffernet_countries_user_info() {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Query differnt_country_people_info = session.createQuery(HQLConstants.list_distinct_countries);
		List<String> list = differnt_country_people_info.getResultList();
		return list;

	}

	public int update_user_info(String first_name) {
		// TODO Auto-generated method stub
		update_first_name = first_name;
		Session session = factory.openSession();

		Query q = session.createQuery("update User u set u.first_name=" + first_name + " where u.mobile=" + 701380622);
		result = q.executeUpdate();

		return result;
	}

	public void delet_User() {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		session.createQuery(HQLConstants.deleteQuery);

	}

	public void addprofile(Profile p) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();

	}

	public void updateUser(int i) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query q1 = session.createQuery(HQLConstants.update_det1);
		q1.setParameter(0, i);
		int result = q1.executeUpdate();
		tx.commit();
		session.close();

	}

	public void delete_user_info(int i) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query q1 = session.createQuery(HQLConstants.deleteQuery);
		q1.setParameter(0, i);
		q1.executeUpdate();
		tx.commit();
		session.close();

	}

	public List<String> retrieve_all_details() {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery(HQLConstants.retrieve_profile);
		List<String> list = q.getResultList();
		tx.commit();
		return list;
	}

	public int update_profile(String email) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery(HQLConstants.update_profile_user_name);

		q.setParameter(0, email);
		int result = q.executeUpdate();
		tx.commit();
		return result;
	}

	public void addItemstoShopperAdda(Category cate_gory) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(cate_gory);
		tx.commit();
		session.close();

	}

}
