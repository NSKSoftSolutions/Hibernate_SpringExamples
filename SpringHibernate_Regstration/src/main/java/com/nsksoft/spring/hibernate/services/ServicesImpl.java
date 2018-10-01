package com.nsksoft.spring.hibernate.services;

import com.nsksoft.spring.hibernate.bean.User;
import com.nsksoft.spring.hibernate.reposotires.MyRepo;

public class ServicesImpl implements SpringServices {

    MyRepo repo;	
	
	public int add_User_details(User user) {
		// TODO Auto-generated method stub
	
		int i=repo.add_user_information(user);
		
		return i;
	}

}
