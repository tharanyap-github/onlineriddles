package com.edubridge.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.model.Question;
import com.edubridge.service.QuestionService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionService questionService;

	@PostMapping("/addquestion")//ok
	public ResponseEntity<Question> saveQuestion(@RequestBody Question question) {		
		return new ResponseEntity<Question>(questionService.saveQuestion(question), HttpStatus.CREATED);
	}

	@GetMapping("/getallquestions")//ok
	public List<Question> getAllQuestions() {    
		return questionService.getAllQuestions();
		
	}
	
	@GetMapping("user/gettestquestions")//ok
	public List<Question> getAllTestQuestions() {  
		List<Question> list=questionService.getAllQuestions();
		Collections.shuffle(list);
		return list;
	}
	
	@GetMapping("/{questionId}")//ok
	public ResponseEntity<Question> getQuestionById(@PathVariable("questionId") int questionId) {
		return new ResponseEntity<Question>(questionService.getQuestionById(questionId), HttpStatus.OK);
	}

	@DeleteMapping("/{questionId}")
	public ResponseEntity<String> removeQuestion(@PathVariable("questionId") int questionId) {
		questionService.removeQuestion(questionId);
		return new ResponseEntity<String>("Question deleted Successfuly", HttpStatus.OK);
	}

	@PutMapping("/{questionId}")//ok
	public ResponseEntity<Question> updateQuestion(@PathVariable("questionId") int questionId, @RequestBody Question question) {
		return new ResponseEntity<Question>(questionService.updateQuestion(questionId, question), HttpStatus.OK);
	}

}