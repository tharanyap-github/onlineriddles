package com.edubridge.service;

import java.util.List;

import com.edubridge.model.Question;

public interface QuestionService {

	public Question saveQuestion(Question question);
	public List<Question> getAllQuestions();
	public Question getQuestionById(int questionId);
	public void removeQuestion(int questionId);
	public Question updateQuestion(int questionId,Question question);

}
