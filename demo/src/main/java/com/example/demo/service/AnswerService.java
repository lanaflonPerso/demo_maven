package com.example.demo.service;

import com.example.demo.repository.AnswerRepository;
import com.example.demo.repository.AnswerRepositoryTf;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    AnswerRepositoryTf answerRepository;


    public AnswerService(AnswerRepository answerRepos){

        answerRepository = answerRepos;
    }

    public List<String> getAll() {

        return answerRepository.findAll();
    }


    public void create(String answer){

        answerRepository.create(answer);
    }
}
