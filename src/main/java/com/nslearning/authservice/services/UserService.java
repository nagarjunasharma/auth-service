package com.nslearning.authservice.services;

import com.nslearning.authservice.model.User;

public interface UserService {
	
	public User addUser(User user);
	
	public User findByUserId(long userId);
	
	public User updateUser(User user);
	
	public void deleteUser(User user);

}
