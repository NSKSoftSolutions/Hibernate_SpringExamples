package com.nsksoft.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nsksoft.spring.hibernate.bean.Profile;
import com.nsksoft.spring.hibernate.bean.User;
import com.nsksoft.spring.hibernate.repositry.Repositry;

@Component
public class ServiceImpl implements Service {

	@Autowired
	private Repositry springrepo;
	int i;

	public int adduser(User user) {
		i = springrepo.save_user_detilas(user);
		return i;
	}

	public List<String> getUser() {
		// TODO Auto-generated method stub

		List complete_users_details = springrepo.get_User_info();

		return complete_users_details;
	}

	public List<String> getDistinctCountriesByUser() {
		// TODO Auto-generated method stub

		List county_users_details = springrepo.getDiffernet_countries_user_info();

		return county_users_details;

	}

	public void addProfile_details(Profile p) {
		// TODO Auto-generated method stub
	
		springrepo.addprofile(p);
		
	}

	public void update_User_details(int i) {
		// TODO Auto-generated method stub
		springrepo.updateUser(i);
	}

	public void deleteUser(int i) {
		// TODO Auto-generated method stub
		springrepo.delete_user_info(i);
	}

	
	

}
