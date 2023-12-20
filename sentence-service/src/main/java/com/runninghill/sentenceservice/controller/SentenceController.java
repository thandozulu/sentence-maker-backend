package com.runninghill.sentenceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.runninghill.sentenceservice.entity.Sentence;
import com.runninghill.sentenceservice.service.SentenceService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/sentence")
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

    @GetMapping("/")
    public List<Sentence> findAll() {
        return sentenceService.findAll();
    }

    @PostMapping("/create")
    public Sentence createSentence(@RequestBody Sentence sentence) {
        return sentenceService.save(sentence);
    }

    @DeleteMapping("/delete/all")
    public @ResponseBody ResponseEntity<String> deleteAllSentences(){
        sentenceService.deleteAll();
        return new ResponseEntity<String>("DELETE Response", HttpStatus.OK);
    }

}
