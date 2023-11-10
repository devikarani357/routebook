package com.example.routeBook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.routeBook.entity.Favourites;
import com.example.routeBook.repository.FavouriteRepository;
import com.example.routeBook.repository.UserRepository;

@Service
public class FavouriteService {
@Autowired
	public FavouriteRepository favouriteRepo;

	public List<Favourites> getAllFavourites() {
		List<Favourites>favourites=new ArrayList<>();
		favouriteRepo.findAll().forEach(favourites::add);
		return favourites;
	}

	public void addfavourite(Favourites favo) {
		
		favouriteRepo.save(favo);
	}
	
	public void updateFavourite(int id,Favourites favourites)
	{
		favouriteRepo.save(favourites);
	}
	
	public void deleteFavourites(int id)
	{
		favouriteRepo.deleteById(id);
	}
	
	
}
