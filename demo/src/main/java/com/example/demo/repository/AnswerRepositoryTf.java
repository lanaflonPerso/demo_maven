package com.example.demo.repository;

import com.example.demo.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepositoryTf extends JpaRepository<Answer,Long> {

    Answer findByValue(String value);

    void create(String answer);
}
