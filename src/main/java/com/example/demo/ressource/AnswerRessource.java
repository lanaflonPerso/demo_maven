package com.example.demo.ressource;

import com.example.demo.entity.Answer;
import com.example.demo.service.AnswerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController()
@RequestMapping("/api")
public class AnswerRessource {

    private AnswerService answerService;

    public AnswerRessource(AnswerService answerService) {
        this.answerService = answerService;
    }

    /*@RequestMapping(method = GET, path = "/answers/{id}")
    public ResponseEntity<Answer> findById(@PathVariable Long id) {
        Optional<Answer> answer = answerService.findById(id);
        return answer.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }*/

    @GetMapping("/answers")
    public List<Answer> findAll() {
        return answerService.findAll();
    }

    @PostMapping("/answers")
    public void create(@RequestBody Answer answer) {
        answerService.add(answer);
    }

}