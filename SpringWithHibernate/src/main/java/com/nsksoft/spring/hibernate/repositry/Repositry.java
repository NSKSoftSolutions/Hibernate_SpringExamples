package com.nsksoft.spring.hibernate.repositry;

import java.util.List;

import com.nsksoft.spring.hibernate.bean.User;


public interface Repositry {

	public int save_user_detilas(User user);
	public List<String> get_User_info();
	public List<String> get_User_info1();	
}
