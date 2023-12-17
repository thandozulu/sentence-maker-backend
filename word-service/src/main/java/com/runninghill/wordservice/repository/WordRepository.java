package com.runninghill.wordservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.runninghill.wordservice.entity.Type;
import com.runninghill.wordservice.entity.Word;
import java.util.List;


@Repository
public interface WordRepository extends JpaRepository<Word, Long> {

    public List<Word> findByType(Type type);

    public List<Word> findByTypeId(Long id);

}
