package com.spring.service;

import com.spring.exception.UserException;
import com.spring.model.User;

public interface UserService {
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String Jwt) throws UserException;
}
