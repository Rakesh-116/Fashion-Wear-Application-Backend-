package com.spring.service;

import com.spring.exception.ProductException;
import com.spring.model.Cart;
import com.spring.model.User;
import com.spring.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId, AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);
	
}
