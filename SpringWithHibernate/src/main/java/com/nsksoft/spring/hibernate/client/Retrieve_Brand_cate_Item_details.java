package com.nsksoft.spring.hibernate.client;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.spring.hibernate.bean.Brand;
import com.nsksoft.spring.hibernate.bean.Category;
import com.nsksoft.spring.hibernate.bean.ItemList;
import com.nsksoft.spring.hibernate.configuration.SpringConfiguration;
import com.nsksoft.spring.hibernate.service.Service;

public class Retrieve_Brand_cate_Item_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Service service = context.getBean(Service.class);
		List result = service.retr_Cate_brand_items();

		Iterator itr = result.iterator();

		while (itr.hasNext()) {
			Object obj = (Object) itr.next();
			Category cat = (Category) obj;
			System.out.println(cat.getCat_name());
			Set s1=cat.getBranddetails();
			Iterator itr1=s1.iterator();
			while(itr1.hasNext())
			{
				Brand b=(Brand)itr1.next();
				System.out.println(b.getBrand_name());
			          Set s2=b.getItem_details();
			          Iterator itr2=s2.iterator();
						while(itr2.hasNext())
						{
							ItemList i=(ItemList)itr2.next();
							System.out.println(i.getFeatures());
						}
			}
			
/*			Brand b = (Brand) obj[1];
			System.out.println(b.getBrand_name());
			ItemList i = (ItemList) obj[2];
			System.out.println(i.getFeatures());
*/
		}

	}

}
