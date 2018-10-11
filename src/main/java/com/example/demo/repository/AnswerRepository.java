package com.example.demo.repository;

import com.example.demo.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
