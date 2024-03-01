package com.user.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.microservice.model.User;
import com.user.microservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public ResponseEntity<Object> insertUser(@RequestBody User user) {

		return new ResponseEntity<>(userService.insertUser(user),HttpStatus.OK);
	}
	
	@GetMapping("/male/users")
	public ResponseEntity<Object> getMaleUsers(){
		
//		System.out.println(search);
		
		return new ResponseEntity<Object>(userService.getMaleusrs(),HttpStatus.OK);
	}
	
	@GetMapping("/female/users")
	public ResponseEntity<Object> getFemales(){
		
		return new ResponseEntity<Object>(userService.getFemaleUsers(),HttpStatus.OK);
	}
	
	@GetMapping("/single-male/users")
	public ResponseEntity<Object> getSingleMale() {
		return new ResponseEntity<Object>(userService.getSingleMale(),HttpStatus.OK);
	}
	
	@GetMapping("/single-female/users")
	public ResponseEntity<Object> getSingleFemale() {
		return new ResponseEntity<Object>(userService.getSingleFemale(),HttpStatus.OK);
	}

}
