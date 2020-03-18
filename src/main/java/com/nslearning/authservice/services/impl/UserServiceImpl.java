package com.nslearning.authservice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nslearning.authservice.model.User;
import com.nslearning.authservice.repository.UserRepository;
import com.nslearning.authservice.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public User addUser(User user) {
		return repository.save(user);
	}

	@Override
	public User findByUserId(long userId) {
		return repository.findByUserId(userId).orElse(null);
	}

	@Override
	public User updateUser(User user) {
		return repository.save(user);
	}

	@Override
	public void deleteUser(User user) {
		repository.delete(user);
	}

}
