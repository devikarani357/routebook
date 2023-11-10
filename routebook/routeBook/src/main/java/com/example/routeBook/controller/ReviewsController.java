package com.example.routeBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.routeBook.entity.Reviews;
import com.example.routeBook.service.ReviewsService;

@RestController
public class ReviewsController {
	@Autowired
	private ReviewsService reviewsService;
	
	@RequestMapping("/review")
public List<Reviews> getAllReviews(){
		return reviewsService.getAllReviews();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/review")
	public void addReviews(@RequestBody Reviews review)
	{
		reviewsService.addReview(review);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/reviews")
	public void updateReview(@PathVariable int id,@RequestBody Reviews reviews)
	{
		reviewsService.updateReview(id, reviews);
	}
	

}
