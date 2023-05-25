package com.edubridge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;

	//name not null
	@NotNull(message = "Please provide your username")
	@Column(name="userName")
	private String userName;
	
	//password unique and not null
	@Column(name = "password", unique = true)
	@Size(min = 5, message = "Your password must have at least 5 characters")
	@NotNull(message = "Please provide your password")
	private String userPassword;

	//email validation
	@Email(message = "Please provide a valid Email")
	//@NotNull(message = "Please provide an email")
	private String userEmail;
	
	@Column(name="phoneNumber")
	private long userPhoneNumber;
	
	private String role;//ADMIN
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public long getUserPhoneNumber() {
		return userPhoneNumber;
	}


	public void setUserPhoneNumber(long userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
