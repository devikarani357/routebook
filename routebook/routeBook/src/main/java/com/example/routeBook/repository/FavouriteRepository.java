package com.example.routeBook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.example.routeBook.entity.Favourites;
@Component

public interface FavouriteRepository extends JpaRepository<Favourites,Integer> {
	@Query(value="select * from Favourites where userId=?",nativeQuery=true)
	  List<Favourites> getByUserId(int id);
	@Query(value="select * from Favourites where routeId=?",nativeQuery=true)
	
	List<Favourites> getByRouteId(int id);
	
	/*@Query(value="select * from Favourites",nativeQuery=true)
	List<Favourites>findAll();*/

}

