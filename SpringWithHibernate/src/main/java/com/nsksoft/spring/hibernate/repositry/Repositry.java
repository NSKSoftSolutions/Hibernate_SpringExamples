package com.nsksoft.spring.hibernate.repositry;

import java.util.List;

import com.nsksoft.spring.hibernate.bean.Category;
import com.nsksoft.spring.hibernate.bean.Profile;
import com.nsksoft.spring.hibernate.bean.User;


public interface Repositry {

	public int save_user_detilas(User user);
	public List<String> get_User_info();
	public List<String> getDiffernet_countries_user_info();
	public void addprofile(Profile p);
	public void updateUser(int i);
	public void delete_user_info(int i);
	public List<String> retrieve_all_details();
	public int update_profile(int res);
	public void addItemstoShopperAdda(Category cate_gory);
	public int delete_Profile_likes(int i);
	public List ret_cat_brand_item_info();
	public List getDistinct_info_of_brands();
	
	
}
