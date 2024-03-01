package com.user.microservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity (name="userdetails")
@Data
public class User extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="mobileno")
	private String mobileNo;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name = "maritalstatus")
	private String maritalStatus;
	
}
