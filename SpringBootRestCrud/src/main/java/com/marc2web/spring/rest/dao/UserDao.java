package com.marc2web.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marc2web.spring.rest.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
