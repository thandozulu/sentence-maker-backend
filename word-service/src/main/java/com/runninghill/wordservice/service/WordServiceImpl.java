package com.runninghill.wordservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runninghill.wordservice.entity.Type;
import com.runninghill.wordservice.entity.Word;
import com.runninghill.wordservice.repository.TypeRepository;
import com.runninghill.wordservice.repository.WordRepository;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordRepository wordRepository;

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public List<Word> findByType(Type type) {
        return wordRepository.findByType(type);
    }

    @Override
    public List<Word> findByTypeId(Long id) {
        return wordRepository.findByTypeId(id);
    }

    @Override
    public List<Type> findTypes() {
        return typeRepository.findAll();
    }

}
