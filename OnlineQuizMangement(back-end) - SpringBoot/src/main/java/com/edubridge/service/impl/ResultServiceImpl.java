package com.edubridge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.exception.ResourceNotFoundException;
import com.edubridge.model.Result;
import com.edubridge.repository.ResultRepository;
import com.edubridge.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService {
	
	@Autowired
	ResultRepository resultRepository;
	
	@Override
	public Result saveResult(Result result) {
		// TODO Auto-generated method stub
		return resultRepository.save(result);
	}

	@Override
	public List<Result> getAllResults() {
		// TODO Auto-generated method stub
		return resultRepository.findAll();
	}


	@Override
	public Result getResultById(int userId) {
		// TODO Auto-generated method stub
		return resultRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("Result","userId",userId));
	}


}
