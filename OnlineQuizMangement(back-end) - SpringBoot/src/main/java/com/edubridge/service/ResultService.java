package com.edubridge.service;

import java.util.List;

import com.edubridge.model.Question;
import com.edubridge.model.Result;

public interface ResultService {

		public Result saveResult(Result result);
		public List<Result> getAllResults();
		public Result getResultById(int userId);
}
