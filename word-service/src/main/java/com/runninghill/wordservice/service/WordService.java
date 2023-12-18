package com.runninghill.wordservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.runninghill.wordservice.entity.Type;
import com.runninghill.wordservice.entity.Word;

@Service
public interface WordService {

    public List<Word> findByType(Type type);

    public List<Word> findByTypeId(Long id);

    public List<Type> findTypes();
    
}
