package com.email.esp.service.impl;

import com.email.esp.model.User;
import com.email.esp.repository.UserRepository;
import com.email.esp.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User checkEmail(String email) {
		
		return userRepository.findByEmail(email);

	}

	@Override
	public User checkPhone(String phone) {
		return userRepository.findByPhone(phone);
	}
    
}
