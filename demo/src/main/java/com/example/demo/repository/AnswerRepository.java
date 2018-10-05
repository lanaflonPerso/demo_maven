package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

@Repository
public class AnswerRepository {

    private static final Map<Integer,String> DATABASE = new HashMap<>();

    public AnswerRepository(){

        DATABASE.put(1,"Marseille");
        DATABASE.put(2,"Lille");
        DATABASE.put(3,"Valenciennes");

    }

    public List<String> getAll() {

        return DATABASE.values().stream().collect(Collectors.toList());
    }

    public void create(String answer){

        DATABASE.put(DATABASE.keySet().size()+1,answer);
    }
}
