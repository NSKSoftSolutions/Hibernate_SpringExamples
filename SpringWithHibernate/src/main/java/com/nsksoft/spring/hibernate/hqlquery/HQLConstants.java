package com.nsksoft.spring.hibernate.hqlquery;

public class HQLConstants {

	
	//select operations
	public static String Retrieve_User_details="from User u";
	public static String Retriving_partial_details=" Select u.first_name,u.last_name,u.mobile,u.email from User u";
    public static String list_distinct_countries="select distinct(u.first_name)from User u";

   
    
     public static String update_det1="update User u SET u.first_name='Sajju ' WHERE u.user_id=?";   

    //delete cquerys
    public static String deleteQuery="delete from User u where u.user_id=?";
	public static String retrieve_profile="from Profile p inner join Likes l on l.user_id=p.user_id";
	public static String update_profile_user_name="update Profile p set p.name='sadakhat' where p.user_id='?'";


}
