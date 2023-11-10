package com.example.routeBook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.routeBook.entity.Favourites;
import com.example.routeBook.entity.User;
import com.example.routeBook.repository.FavouriteRepository;
import com.example.routeBook.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
     public UserRepository userRepo;
	@Autowired
	public FavouriteRepository favouriteRepository;
	public List<User>getAllUsers()
	{
		List<User>users=new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}
	
	public List<Favourites>getAllFavourites(int id)
	{
		List<Favourites>favourites=new ArrayList<>();
		favouriteRepository.getByUserId(id);
		return favourites;
		
	}
	
	
	public void addUser(User user)
	{
		userRepo.save(user);
	}
	
	public void updateUser(int id,User user)
	{
		userRepo.save(user);
	}
	
	public void deleteUser(int id)
	{
		userRepo.deleteById(id);
	}
}
