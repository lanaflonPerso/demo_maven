package com.example.demo.service;

import com.example.demo.repository.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    AnswerRepository answerRepository;


    public AnswerService(AnswerRepository answerRepos){

        answerRepository = answerRepos;
    }

    public List<String> getAll() {

        return answerRepository.getAll();
    }


    public void create(String answer){

        answerRepository.create(answer);
    }
}
