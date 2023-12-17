package com.runninghill.sentenceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import com.runninghill.sentenceservice.entity.Sentence;
import com.runninghill.sentenceservice.service.SentenceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;˚


@RestController
@RequestMapping("/api/v1/sentence")
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

    @GetMapping("/")
    public List<Sentence> findAll() {
        return sentenceService.findAll();
    }

    //todo: create sentence

}
