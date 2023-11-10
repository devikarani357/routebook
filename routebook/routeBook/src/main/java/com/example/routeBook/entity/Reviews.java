package com.example.routeBook.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Reviews {
	@Id
	@GeneratedValue
	int id;
	String reviews;

	public Reviews() {
		super();
	}

	public Reviews(String reviews) {
		this.reviews = reviews;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	

}
