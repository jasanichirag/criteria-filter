package com.user.microservice.criterias;

import java.util.List;
import java.util.stream.Collectors;

import com.user.microservice.criteria.UserCriteria;
import com.user.microservice.model.User;

public class SingleOrFemale implements UserCriteria {

	@Override
	public List<User> userCriteria(List<User> users) {
		
		return users.stream().filter(user -> user.getGender().equalsIgnoreCase("female") || user.getMaritalStatus().equalsIgnoreCase("single")).collect(Collectors.toList());
	}

}
