package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.exception.OrderException;
import com.spring.model.Address;
import com.spring.model.Order;
import com.spring.model.User;
import com.spring.repository.CartRepository;

@Service
public class OrderServiceImplementation implements OrderService {
	
	private CartRepository cartRespository;
	private CartService cartItemService;
	private ProductService productService;
	
	public OrderServiceImplementation(CartRepository cartRespository, CartService cartItemService, ProductService productService) {
		this.cartRespository = cartRespository;
		this.cartItemService = cartItemService;
		this.productService = productService;
	}

	@Override
	public Order createOrder(User user, Address shippingAddress) {
		
		return null;
	}

	@Override
	public Order findOrderById(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> usersOrderHistory(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order placedOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order confirmedOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order shippedOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order deliveredOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order canceledOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		
	}

}
