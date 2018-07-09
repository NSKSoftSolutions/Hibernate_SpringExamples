package com.nsksoft.spring.hibernate.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Profile {
	@Id
	private String user_id;
	private String name;

	@OneToMany(targetEntity = Likes.class, cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "user_id",referencedColumnName="user_id")
	private Set<Likes> likes;

	public String getUser_id() {
		return user_id;
	}

	

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getLikes() {
		return likes;
	}

	public void setLikes(Set likes) {
		this.likes = likes;
	}

}
