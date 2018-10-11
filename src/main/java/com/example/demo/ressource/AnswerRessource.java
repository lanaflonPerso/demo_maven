package com.example.demo.ressource;

import com.example.demo.entity.Answer;
import com.example.demo.service.AnswerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class AnswerRessource {

    private AnswerService answerService;

    public AnswerRessource(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping("/answers")
    public List<Answer> findAll() {
        return answerService.findAll();
    }

    @PostMapping("/answers")
    public void create(@RequestBody Answer answer) {
        answerService.add(answer);
    }

}