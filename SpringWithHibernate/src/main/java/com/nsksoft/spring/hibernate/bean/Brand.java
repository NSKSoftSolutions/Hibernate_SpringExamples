package com.nsksoft.spring.hibernate.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Brand {
    @Id
	private String brand_id;
	private String brand_name;
	private String manifatured_by;
	private String brand_type;
	private String os_type;
	@OneToMany(targetEntity=ItemList.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="brand_id")
	private Set<ItemList> item_details;
	private double starting_price;
	public double getStarting_price() {
		return starting_price;
	}
	public void setStarting_price(double starting_price) {
		this.starting_price = starting_price;
	}
	public double getMax_price() {
		return max_price;
	}
	public void setMax_price(double max_price) {
		this.max_price = max_price;
	}
	private double max_price;
	public String getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getManifatured_by() {
		return manifatured_by;
	}
	public void setManifatured_by(String manifatured_by) {
		this.manifatured_by = manifatured_by;
	}
	public String getBrand_type() {
		return brand_type;
	}
	public void setBrand_type(String brand_type) {
		this.brand_type = brand_type;
	}
	public String getOs_type() {
		return os_type;
	}
	public void setOs_type(String os_type) {
		this.os_type = os_type;
	}
	public Set<ItemList> getItem_details() {
		return item_details;
	}
	public void setItem_details(Set<ItemList> item_details) {
		this.item_details = item_details;
	}
	
	
	
}
