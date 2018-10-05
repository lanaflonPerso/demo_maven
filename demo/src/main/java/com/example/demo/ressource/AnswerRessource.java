package com.example.demo.ressource;

import com.example.demo.service.AnswerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnswerRessource {

    private AnswerService answerService;

    public AnswerRessource(AnswerService answerService) {
        this.answerService = answerService;
    }

    @RequestMapping("/answer")
    public List<String> getAll() {
        return answerService.getAll();
    }

    @PostMapping("/answer")
    public void create(@RequestBody String answer){
        answerService.create(answer);

    }
}
