package com.example.routeBook.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Route")
public class Route {
	@Id
	private int routeId;
	private String source;
	private String destination;
	private String description;
	
	
	@ManyToOne
	private  User users;
	
	

	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}

	@OneToMany(targetEntity=Favourites.class,cascade=CascadeType.ALL)
	 @JoinColumn(referencedColumnName="routeId",name="route_id")

	private List<Favourites>favourites;
	
	
	public List<Favourites> getFavourites() {
		return favourites;
	}
	public void setFavourites(List<Favourites> favourites) {
		this.favourites = favourites;
	}
	
	@OneToMany(targetEntity=Reviews.class,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="routeId",name="route_id")
	private List<Reviews>reviews;
	
	
	public List<Reviews> getReviews() {
		return reviews;
	}
	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}
	
	
	
	
	public Route() {
		super();
	}
	public Route(int routeId, String source, String destination, String description) {
		super();
		this.routeId = routeId;
		this.source = source;
		this.destination = destination;
		this.description = description;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
