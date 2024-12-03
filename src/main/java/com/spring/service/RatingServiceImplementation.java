package com.spring.service;

import java.time.LocalDateTime;
import java.util.List;

import com.spring.exception.ProductException;
import com.spring.model.Product;
import com.spring.model.Rating;
import com.spring.model.User;
import com.spring.repository.RatingRepository;
import com.spring.request.RatingRequest;

public class RatingServiceImplementation implements RatingService {
	
	private RatingRepository ratingRepository;
	private ProductService productService;
	
	public RatingServiceImplementation(RatingRepository ratingRepository,ProductService productService) {
		this.ratingRepository = ratingRepository
;		this.productService = productService;
	}

	@Override
	public Rating createRating(RatingRequest req, User user) throws ProductException {
		Product product = productService.findProductById(req.getProductId());
		
		Rating rating = new Rating();
		rating.setUser(user);
		rating.setRating(req.getRating());
		rating.setCreatedAt(LocalDateTime.now());
		
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getProductsRating(Long productId) {
		return ratingRepository.getAllProductsRating(productId);
	}

}
