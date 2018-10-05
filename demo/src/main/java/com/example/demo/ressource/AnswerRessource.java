package com.example.demo.ressource;

import com.example.demo.service.AnswerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerRessource {

    private final AnswerService answerService;

    public AnswerRessource(AnswerService answerService) {
        this.answerService = answerService;
    }

    @RequestMapping("/answer")
    public String get() {
        return answerService.getAll();
    }
    
}
