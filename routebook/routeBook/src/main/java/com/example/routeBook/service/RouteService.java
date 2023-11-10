package com.example.routeBook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.routeBook.entity.Favourites;
import com.example.routeBook.entity.Route;
import com.example.routeBook.repository.FavouriteRepository;
import com.example.routeBook.repository.RouteRepository;

@Service
public class RouteService {
	@Autowired
	public RouteRepository routeRepo;
	
	@Autowired
	public FavouriteRepository favouriteRepository;
	public List<Route>getAllRoutes()
	{
		List<Route>routes=new ArrayList<>();
		routeRepo.findAll().forEach(routes::add);
		return routes;
	}
	
	public List<Favourites>getAllFavourites(int id)
	{
		List<Favourites>favourites=new ArrayList<>();
		favouriteRepository.getByRouteId(id);
		return favourites;
		
	}
	
	public void addRoute(Route route)
	{
		routeRepo.save(route);
	}

	public void updateRoute(int id,Route route) {
		routeRepo.save(route);
		
	}

	public void deleteRoute(int id) {
	    routeRepo.deleteById(id);
		
	}

}
