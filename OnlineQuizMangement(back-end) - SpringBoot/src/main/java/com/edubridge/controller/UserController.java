package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.model.User;
import com.edubridge.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins="http://localhost:4200")
//@RequestMapping("/Api/User")
@RequestMapping("/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping()
	public  ResponseEntity<User> saveUser(@Validated @RequestBody User user)
	{
	return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.CREATED);
	}
	
	@PostMapping("login")
	public  ResponseEntity<User> loginUser(@RequestBody User user)
	{
	return new ResponseEntity<User>(userService.loginUser(user),HttpStatus.OK);
	}
	
	@GetMapping()//ok
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("admin/{userId}")//ok
	//@PreAuthorize("hasRole('ADMIN')")
	public  ResponseEntity<User> getUserById(@PathVariable("userId") int userId)
	{
		return new ResponseEntity<User>(userService.getUserById(userId),HttpStatus.OK); 
	}
	
	@DeleteMapping("admin/{userId}")//ok
	public ResponseEntity<String> removeUser(@PathVariable("userId") int userId) {
		userService.removeUser(userId);
		return new ResponseEntity<String>("User deleted Successfuly", HttpStatus.OK);
	}
	
	@PutMapping("admin/{userId}")//ok
	public ResponseEntity<User> updateUser(@PathVariable("userId") int userId,@RequestBody User user) {
		return new ResponseEntity<User>(userService.updateUser(userId, user), HttpStatus.OK);
	}
	
	@PutMapping("user/{userId}")//ok
	public ResponseEntity<User> updateAdmin(@PathVariable("userId") int userId,@RequestBody User user) {
		return new ResponseEntity<User>(userService.updateUser(userId, user), HttpStatus.OK);
	}
}
