package com.spring.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.config.JwtProvider;
import com.spring.exception.UserException;
import com.spring.model.User;
import com.spring.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	
	private UserRepository userRepository;
	private JwtProvider jwtProvider;
	
	public UserServiceImplementation(UserRepository userRepository, JwtProvider jwtProvider) {
		this.userRepository = userRepository;
		this.jwtProvider = jwtProvider;
	}

	@Override
	public User findUserById(Long userId) throws UserException {
		
		Optional<User> user = userRepository.findById(userId);
		if(user.isPresent()) {
			return user.get();
		}
		
		throw new UserException("User not found with ID - " + userId);
	}

	@Override
	public User findUserProfileByJwt(String Jwt) throws UserException {
		String email = jwtProvider.getEmailFromToken(Jwt);
		
		User user = userRepository.findByEmail(email);
		
		if(user == null) {
			throw new UserException("User not found with email - " + email);
		}
		
		return user;
	}

}
