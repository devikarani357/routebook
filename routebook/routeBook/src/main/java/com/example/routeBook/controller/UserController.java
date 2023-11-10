package com.example.routeBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.routeBook.entity.User;
import com.example.routeBook.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/use")
   public List<User>getAllUsers()
    {
		return userService.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/use")
	public void addUser(@RequestBody User user)
	{
		userService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/use/{id}")
	public void updateUser(@PathVariable int id,@RequestBody User user)
	{
		userService.updateUser(id,user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/use/{id}")
	public void deleteUser(@PathVariable int id)
	{
		userService.deleteUser(id);
	}
}
