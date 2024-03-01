package com.user.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.microservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
