package com.example.demo.ressource;

import com.example.demo.entity.Subscription;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController("/subscription")

public class SubscriptionRessource {

    @RequestMapping(method = POST)
    public ResponseEntity<Void> create(@RequestBody Subscription subscription){
        return ResponseEntity.ok().build();
    }
}
