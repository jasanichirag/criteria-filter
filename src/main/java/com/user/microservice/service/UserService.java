package com.user.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.microservice.criteria.UserCriteria;
import com.user.microservice.criterias.FemalesCriteria;
import com.user.microservice.criterias.MaleCriteria;
import com.user.microservice.criterias.SingleMale;
import com.user.microservice.criterias.SingleOrFemale;
import com.user.microservice.model.User;
import com.user.microservice.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User insertUser(User user) {

		return userRepository.save(user);
	}

	public List<User> getMaleusrs() {
		List<User> allUsers = userRepository.findAll();
		UserCriteria male = new MaleCriteria();

//	return	allUsers.stream()
//				.filter(user -> user.getFirstName().equalsIgnoreCase(request)
//						|| user.getLastName().equalsIgnoreCase(request)
//						|| user.getGender().equalsIgnoreCase(request)
//						|| user.getMaritalStatus().equalsIgnoreCase(request)
//						|| user.getMobileNo().equalsIgnoreCase(request)).collect(Collectors.toList());

		return male.userCriteria(allUsers);
	}
	
	public List<User> getFemaleUsers() {
		List<User> users = userRepository.findAll();
		UserCriteria female=new FemalesCriteria();
		return female.userCriteria(users);
	}
	
	public List<User> getSingleMale() {
		List<User> users = userRepository.findAll();
		UserCriteria singleMale=new SingleMale();
		return singleMale.userCriteria(users);
		
	}
	
	public List<User> getSingleFemale() {
		List<User> users = userRepository.findAll();
		UserCriteria singleFemale=new SingleOrFemale();
		return singleFemale.userCriteria(users);
		
		
	}
	

}
