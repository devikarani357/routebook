package com.example.routeBook.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	@OneToMany(targetEntity=Route.class,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="id",name="user_id")
private List<Route> route;
	
	
	public List<Route> getRoute() {
		return route;
	}
	public void setRoute(List<Route> route) {
		this.route = route;
	}
	
	
	@OneToMany(targetEntity=Favourites.class,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="id",name="user_id")

	private List<Favourites>favourites;
	
	
	public List<Favourites> getFavourites() {
		return favourites;
	}
	public void setFavourites(List<Favourites> favourites) {
		this.favourites = favourites;
	}
	
	
	@OneToMany(targetEntity=Reviews.class,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="id",name="user_id")
	
	private List<Reviews>reviews;
	
	public List<Reviews> getReviews() {
		return reviews;
	}
	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
