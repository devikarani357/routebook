package com.example.routeBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.routeBook.entity.Route;
import com.example.routeBook.service.RouteService;

@RestController
public class RouteController {
	@Autowired
	private RouteService routeService;
	@RequestMapping("/rout")
	public List<Route>getAllRoutes()
	{
		return routeService.getAllRoutes();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/rout")
	public void addRoute(@RequestBody Route route)
	{
		routeService.addRoute(route);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/rout/{id}")
	public void updateRoute(@PathVariable int id,@RequestBody Route route)
	{
		routeService.updateRoute(id,route);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/rout/{id}")
	public void deleteRoute(@PathVariable int id)
	{
		routeService.deleteRoute(id);
	}


}
