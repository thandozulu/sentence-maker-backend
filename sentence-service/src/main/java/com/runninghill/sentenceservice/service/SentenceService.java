package com.runninghill.sentenceservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.runninghill.sentenceservice.entity.Sentence;

@Service
public interface SentenceService {

    List<Sentence> findAll();

    Sentence save(Sentence sentence);

    void deleteAll();

}
