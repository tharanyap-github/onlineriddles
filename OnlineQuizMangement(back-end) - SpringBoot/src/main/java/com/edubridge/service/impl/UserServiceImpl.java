package com.edubridge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.model.User;
import com.edubridge.exception.ResourceNotFoundException;
import com.edubridge.repository.UserRepository;
import com.edubridge.service.UserService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		//BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder();
		//String enPassWrd=bcrypt.encode(user.getUserPassword());
		//user.setUserPassword(enPassWrd);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
		

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("user","userId",userId));
	}

	@Override
	public void removeUser(int userId) {
		// TODO Auto-generated method stub
		User user=getUserById(userId);
		userRepository.deleteById(user.getUserId());		
	}

	@Override
	public User updateUser(int userId, User user) {
		// TODO Auto-generated method stub
		User user2=getUserById(userId);
		user2.setUserName(user.getUserName());
		user2.setUserEmail(user.getUserEmail());
		//BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder();
		//String enPassWrd=bcrypt.encode(user.getUserPassword());
		user2.setUserPassword(user.getUserPassword());
		user2.setUserPhoneNumber(user.getUserPhoneNumber());
		return userRepository.save(user2);
	}

	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.findByUserNameAndUserPassword(user.getUserName(),user.getUserPassword());
	}

}
