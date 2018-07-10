package com.nsksoft.spring.hibernate.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	private String cat_id;
	private String cat_name;
	@OneToMany(targetEntity=Brand.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="cat_id")
	private Set<Brand> branddetails;
	public String getCat_id() {
		return cat_id;
	}
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public Set getBranddetails() {
		return branddetails;
	}
	public void setBranddetails(Set branddetails) {
		this.branddetails = branddetails;
	}
     

}
