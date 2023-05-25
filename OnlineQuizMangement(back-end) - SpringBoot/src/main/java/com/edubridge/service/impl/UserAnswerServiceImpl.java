package com.edubridge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edubridge.model.UserAnswer;
import com.edubridge.repository.UserAnswerRepository;
import com.edubridge.service.UserAnswerService;

@Service
public class UserAnswerServiceImpl implements UserAnswerService {
	
	@Autowired
	UserAnswerRepository userAnswerRepository;


	@Override
	public UserAnswer saveUserAnswer(UserAnswer userAnswer) {
		// TODO Auto-generated method stub
		return userAnswerRepository.save(userAnswer);
	}

}
