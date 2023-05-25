package com.edubridge.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.exception.ResourceNotFoundException;
import com.edubridge.model.Question;
import com.edubridge.repository.QuestionRepository;
import com.edubridge.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;
	
	QuestionService questionService;

	@Override
	public Question saveQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub	
		return questionRepository.findAll();
	}

	@Override
	public Question getQuestionById(int questionId) {
		// TODO Auto-generated method stub
		return questionRepository.findById(questionId).orElseThrow(()->new ResourceNotFoundException("Question","questionId",questionId));
	}

	@Override
	public void removeQuestion(int questionId) {
		// TODO Auto-generated method stub
		Question question=getQuestionById(questionId);
		questionRepository.deleteById(question.getQuestionId());
	}

	@Override
	public Question updateQuestion(int questionId, Question question) {
		// TODO Auto-generated method stub
		Question question2=getQuestionById(questionId);
		question2.setQuestionName(question.getQuestionName());
		question2.setOptionA(question.getOptionA());
		question2.setOptionB(question.getOptionB());
		question2.setOptionC(question.getOptionC());
		question2.setOptionD(question.getOptionD());
		question2.setAnswer(question.getAnswer());
		return questionRepository.save(question2);
	}

}
