package com.spring.data.jpa.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eid;
	@Override
	public String toString() {
		return "Employee [e_id=" + eid + ", name=" + name + "]";
	}

	private String name;

	public Employee() {

	}

	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setE_id(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
