package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
import com.edubridge.model.Result;
import com.edubridge.service.ResultService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/result")
public class ResultController {
	@Autowired
	ResultService resultService;

	@PostMapping("user/addresult")//ok
	public ResponseEntity<Result> saveResult(@RequestBody Result result) {
		return new ResponseEntity<Result>(resultService.saveResult(result), HttpStatus.CREATED);
	}
	
	@GetMapping("admin/getallresult")//ok
	public List<Result> getAllResults() {
		return resultService.getAllResults();
	}
	

	@GetMapping("/{userId}")//ok
	public ResponseEntity<Result> getQuestionById(@PathVariable("userId") int userId) {
		return new ResponseEntity<Result>(resultService.getResultById(userId), HttpStatus.OK);
	}
}
