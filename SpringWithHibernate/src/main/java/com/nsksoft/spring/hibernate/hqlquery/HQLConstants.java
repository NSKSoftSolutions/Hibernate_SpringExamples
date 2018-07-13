package com.nsksoft.spring.hibernate.hqlquery;

public class HQLConstants {

	// select operations
	public static String Retrieve_User_details = "from User u";
	public static String Retriving_partial_details = "Select u.first_name,u.last_name,u.mobile,u.email from User u";
	public static String list_distinct_firstName = "select distinct(u.first_name)from User u";
	public static String retrieve_profile = "from Profile p inner join Likes l on l.user_id=p.user_id";
	public static String ret_cat_brand_item_details="from Category cat";
	public static String retr_distinct_brand_details="select distinct(b.brand_name) from Brand b";
	// update querys
	public static String update_det1 = "update User u SET u.first_name='Sajju ' WHERE u.user_id=?";
	public static String update_profile_user_name = "update profile_info inner join like_info on profile_info.user_id=like_info.user_id set profile_info.name='SajjadAlikhan Navab',like_info.liked_by='Mohan Reddy',like_info.type_of_like='Thumps Up' where profile_info.user_id=?";
	
	// delete cquerys
	public static String deleteQuery = "delete from User u where u.user_id=?";
	public static String delete_profile_and_likes = "DELETE p,l FROM profile_info p JOIN like_info l ON p.user_id=l.user_id WHERE p.user_id=? ";
	
	
}
