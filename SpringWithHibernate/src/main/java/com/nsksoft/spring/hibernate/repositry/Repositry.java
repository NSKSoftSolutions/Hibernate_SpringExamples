package com.nsksoft.spring.hibernate.repositry;

import java.util.List;

import com.nsksoft.spring.hibernate.bean.Profile;
import com.nsksoft.spring.hibernate.bean.User;


public interface Repositry {

	public int save_user_detilas(User user);
	public List<String> get_User_info();
	public List<String> getDiffernet_countries_user_info();
	public void addprofile(Profile p);
	public void updateUser(int i);
	public void delete_user_info(int i);
	
	
}
