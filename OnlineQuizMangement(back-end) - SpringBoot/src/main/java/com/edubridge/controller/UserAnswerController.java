package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.model.UserAnswer;
import com.edubridge.service.UserAnswerService;

@RestController
@RequestMapping("/user/")
public class UserAnswerController {
	@Autowired
	UserAnswerService userAnswerService;

	@PostMapping("adduseranswer")//ok
	public ResponseEntity<UserAnswer> saveUserAnswer(@Validated @RequestBody UserAnswer userAnswer) {
		return new ResponseEntity<UserAnswer>(userAnswerService.saveUserAnswer(userAnswer), HttpStatus.CREATED);
	}

}
