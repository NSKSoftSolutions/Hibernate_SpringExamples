package com.nsksoft.spring.hibernate.service;

import java.util.List;

import com.nsksoft.spring.hibernate.bean.Category;
import com.nsksoft.spring.hibernate.bean.Profile;
import com.nsksoft.spring.hibernate.bean.User;

public interface Service {

	public int adduser(User user);
	public List<String> getUser();
	public List<String> getDistinctCountriesByUser();
	public void addProfile_details(Profile p);
	public void update_User_details(int i);
	public void deleteUser(int i);
	public List getProfileLikes();
	public int update_Profile_likes(int i);
	public void addcategory_brand_item_details(Category cate_gory);
	public int delete_profile_and_likes_info(int i);
	public List retr_Cate_brand_items();
	public List getDistint_brands();
	
	
}
