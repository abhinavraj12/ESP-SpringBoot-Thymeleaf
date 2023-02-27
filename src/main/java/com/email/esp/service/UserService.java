package com.email.esp.service;

import com.email.esp.model.User;

public interface UserService {
	public User createUser(User user);
	public User checkEmail(String email);
	public User checkPhone(String phone);
}
