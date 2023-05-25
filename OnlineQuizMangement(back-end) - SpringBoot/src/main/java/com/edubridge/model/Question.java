package com.edubridge.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;
	
	private String questionName;
	
	private String optionA;
	
	private String optionB;
	
	private String optionC;
	
	private String optionD;
	
	//@OneToOne(cascade=CascadeType.ALL)//correct answer
	//@JoinColumn(name="fk_ans")
	//private Answer ans;
	
	private String answer;
	
	@OneToOne(cascade=CascadeType.ALL)//user answer
	@JoinColumn(name="fk_userans")
	private UserAnswer userans;
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public UserAnswer getUserans() {
		return userans;
	}
	public void setUserans(UserAnswer userans) {
		this.userans = userans;
	}

	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

}