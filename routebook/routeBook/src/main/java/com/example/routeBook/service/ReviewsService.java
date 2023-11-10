package com.example.routeBook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.routeBook.entity.Reviews;
import com.example.routeBook.repository.ReviewsRepository;

@Service
public class ReviewsService {
	
	public ReviewsRepository reviewsRepository;
	
	public List<Reviews>getAllReviews()
	{
		List<Reviews>reviews=new ArrayList<>();
		reviewsRepository.findAll().forEach(reviews::add);
		return reviews;
	}

	public void addReview(Reviews review) {
		reviewsRepository.save(review);
		
	}

	public void updateReview(int id, Reviews review) {
	
		reviewsRepository.save(review);
	}



}
