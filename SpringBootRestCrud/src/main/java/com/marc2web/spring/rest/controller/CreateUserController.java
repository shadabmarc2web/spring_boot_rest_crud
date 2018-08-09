package com.marc2web.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marc2web.spring.rest.dao.UserDao;
import com.marc2web.spring.rest.entity.User;
import com.marc2web.spring.rest.service.UserService;

@RestController
@Controller

public class CreateUserController {
	

	@Autowired
	private UserService userService;
	
	
	
	@PostMapping(value="/add")
	public User creatUser(User user) {
		
		return userService.createUser(user);
		
	}
	
	@GetMapping(value="/users/{ID}")
	public User getUserByID(@PathVariable("ID")Integer id) {
		return userService.getUserByID(id);
		
		
	}
	
	

}
