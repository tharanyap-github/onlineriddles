package com.edubridge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAnswer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userAnswerId;
	
	private String userAnswer;

	public int getUserAnswerId() {
		return userAnswerId;
	}

	public void setUserAnswerId(int userAnswerId) {
		this.userAnswerId = userAnswerId;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}
	
}
