package com.spring.service;

import java.util.List;

import com.spring.exception.ProductException;
import com.spring.model.Review;
import com.spring.model.User;
import com.spring.request.ReviewRequest;

public interface ReviewService {
	
	public Review createReview(ReviewRequest req, User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);

}
