package com.spring.service;

import java.util.List;

import com.spring.exception.ProductException;
import com.spring.model.Rating;
import com.spring.model.User;
import com.spring.request.RatingRequest;

public interface RatingService {
	
	public Rating createRating(RatingRequest req, User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);
	
}
