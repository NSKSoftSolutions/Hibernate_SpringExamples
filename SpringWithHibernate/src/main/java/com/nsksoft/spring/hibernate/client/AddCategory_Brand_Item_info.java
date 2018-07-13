package com.nsksoft.spring.hibernate.client;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.bean.Brand;
import com.nsksoft.spring.hibernate.bean.Category;
import com.nsksoft.spring.hibernate.bean.ItemList;
import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class AddCategory_Brand_Item_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service = context.getBean(Service.class);

		ItemList item = new ItemList();
		item.setItem_name("Iphon 7");
		item.setPrice(57000);
		item.setQuantity(2);
		item.setRating(4.5);
		item.setFeatures("4 GB RAM,32 GB Internal Memory ");
		item.setItem_color("Silver");
		item.setWarrenty("12 months ");
		item.setReviews("silcky and smooth  exceptional");

		Set<ItemList> s1 = new HashSet<ItemList>();
		s1.add(item);

		Brand brand = new Brand();
		brand.setBrand_id(14356);
		brand.setBrand_name("Apple");
		brand.setVendor_email("apple@stevjob.com");
		brand.setBrand_type("Mobile");
		brand.setManifatured_by("Chaina");
		brand.setMax_price(100000);
		brand.setStarting_price(18000);
		brand.setItem_details(s1);
        brand.setOs_type("IOS"); 
		Set<Brand> s2 = new HashSet<Brand>();
		s2.add(brand);
        
		Category cate_gory=new Category();
		cate_gory.setCat_id(3538);
		cate_gory.setCat_name("Mobiles");
		cate_gory.setBranddetails(s2);
		
		service.addcategory_brand_item_details(cate_gory);

	}

}
