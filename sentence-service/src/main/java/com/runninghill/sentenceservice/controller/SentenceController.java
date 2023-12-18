package com.runninghill.sentenceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import com.runninghill.sentenceservice.entity.Sentence;
import com.runninghill.sentenceservice.service.SentenceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/sentence")
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Sentence> findAll() {
        return sentenceService.findAll();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Sentence createSentence(@RequestBody String sentence) {
        Sentence newSentence = Sentence.builder().content(sentence).build();
        return sentenceService.save(newSentence);
    }
    

}
