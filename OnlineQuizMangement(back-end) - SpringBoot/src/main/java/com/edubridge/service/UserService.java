package com.edubridge.service;

import java.util.List;
import com.edubridge.model.User;

public interface UserService {
	
	public User saveUser(User user);
	public List<User> getAllUsers();
	public User getUserById(int userId);
	public void removeUser(int userId);
	
	public User updateUser(int userId,User user);
	
	public User loginUser(User user);

}
