package com.nsksoft.spring.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="like_info")
public class Likes {

	private String user_id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int like_id;
	

	private String type_of_like;
	@Override
	public String toString() {
		return "Likes [user_id=" + user_id + ", like_id=" + like_id + ", type_of_like=" + type_of_like + ", liked_by="
				+ liked_by + ", no_of_likes=" + no_of_likes + "]";
	}

	private String liked_by;
	private int no_of_likes;

	public int getLike_id() {
		return like_id;
	}

	public void setLike_id(int like_id) {
		this.like_id = like_id;
	}

	public String getType_of_like() {
		return type_of_like;
	}

	public void setType_of_like(String type_of_like) {
		this.type_of_like = type_of_like;
	}

	public String getLiked_by() {
		return liked_by;
	}

	public void setLiked_by(String liked_by) {
		this.liked_by = liked_by;
	}

	public int getNo_of_likes() {
		return no_of_likes;
	}

	public void setNo_of_likes(int no_of_likes) {
		this.no_of_likes = no_of_likes;
	}

}
