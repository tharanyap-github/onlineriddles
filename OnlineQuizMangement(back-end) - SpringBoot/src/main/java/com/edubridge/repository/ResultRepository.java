package com.edubridge.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.edubridge.model.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result,Integer> {

	
}
