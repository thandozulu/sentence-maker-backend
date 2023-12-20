package com.runninghill.sentenceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.runninghill.sentenceservice.entity.Sentence;

@Repository
public interface SentenceRepository extends JpaRepository<Sentence, Long> {
}
