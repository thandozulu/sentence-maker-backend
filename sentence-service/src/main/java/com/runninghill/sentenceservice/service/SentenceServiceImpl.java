package com.runninghill.sentenceservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runninghill.sentenceservice.entity.Sentence;
import com.runninghill.sentenceservice.repository.SentenceRepository;

@Service
public class SentenceServiceImpl implements SentenceService{

    @Autowired
    private SentenceRepository sentenceRepository;

    @Override
    public List<Sentence> findAll() {
        return sentenceRepository.findAll();
    }

    @Override
    public Sentence save(Sentence sentence) {
        return sentenceRepository.save(sentence);
    }

    @Override
    public void deleteAll() {
        sentenceRepository.deleteAll();
    }
    
}
