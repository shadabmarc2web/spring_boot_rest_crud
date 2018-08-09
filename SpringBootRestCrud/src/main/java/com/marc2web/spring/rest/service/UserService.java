package com.marc2web.spring.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marc2web.spring.rest.dao.UserDao;
import com.marc2web.spring.rest.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User createUser(User user) {
		return userDao.save(user);
	}

	public User getUserByID(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getOne(id);
		
	}

}
