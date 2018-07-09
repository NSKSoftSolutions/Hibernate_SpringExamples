package com.nsksoft.spring.hibernate.service;

import java.util.List;

import com.nsksoft.spring.hibernate.bean.Profile;
import com.nsksoft.spring.hibernate.bean.User;

public interface Service {

	public int adduser(User user);
	public List<String> getUser();
	public List<String> getDistinctCountriesByUser();
	public void addProfile_details(Profile p);
	public void update_User_details(int i);
	public void deleteUser(int i);
	
	
}
