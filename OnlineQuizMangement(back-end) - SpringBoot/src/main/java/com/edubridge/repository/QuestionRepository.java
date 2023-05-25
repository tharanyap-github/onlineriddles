package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {

}
