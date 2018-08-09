package com.marc2web.spring.rest;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.marc2web.spring.rest.entity.User;
import com.marc2web.spring.rest.service.UserService;

@SpringBootApplication
public class SpringBootRestCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(SpringBootRestCrudApplication.class, args);
		UserService userService=applicationContext.getBean("userService",UserService.class);
		User user=new User();
		user.setUname("shadab");
		user.setDob(new Date());
		user.setCity("hyd");
		user.setEmail("shad@email.com");
		user.setPassword("shadab");

		
		
		userService.createUser(user);

		
		
		
	}
}
