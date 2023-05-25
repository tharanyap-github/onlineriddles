package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.model.UserAnswer;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswer,Integer> {
	
}
