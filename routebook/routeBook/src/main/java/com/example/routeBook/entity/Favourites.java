package com.example.routeBook.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="favourites")
public class Favourites {

	
	
	@Id
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne
	private User users;
	

	
	
	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	@ManyToOne
	    @JoinColumn(name = "route_id", referencedColumnName = "routeId")
	private Route route;
	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	

	
	

	
}
