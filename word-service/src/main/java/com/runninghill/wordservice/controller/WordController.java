package com.runninghill.wordservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runninghill.wordservice.entity.Type;
import com.runninghill.wordservice.entity.Word;
import com.runninghill.wordservice.service.WordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("api/v1/word")
public class WordController {

    @Autowired
    private WordService wordService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Word> findByTypeId(@PathVariable("id") Long id) {
        return wordService.findByTypeId(id);
    }
    
    @PostMapping("/")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Word> findByType(@RequestBody Type type) {
        return wordService.findByType(type);
    }
    
    @GetMapping("/types/all")
    public List<Type> findTypes() {
        return wordService.findTypes();
    }
    
}
