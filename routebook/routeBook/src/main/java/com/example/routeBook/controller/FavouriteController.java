package com.example.routeBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.routeBook.entity.Favourites;
import com.example.routeBook.entity.Route;
import com.example.routeBook.service.FavouriteService;
import com.example.routeBook.service.RouteService;

@RestController
public class FavouriteController {

	@Autowired
	private FavouriteService favouriteService;

	 
	
	@RequestMapping("/favo")
	public List<Favourites>getAllFavourites()
	{
		return favouriteService.getAllFavourites();
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/favo")
	public void addFavourites(@RequestBody Favourites favo)
	{
		favouriteService.addfavourite(favo);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/favo/{id}")
	public void updateFavourite(@PathVariable int id,@RequestBody Favourites favourites)
	{
		favouriteService.updateFavourite(id, favourites);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/favo")
	public void deleteFavourites(@PathVariable int id)
	{
		favouriteService.deleteFavourites(id);
	}
}


