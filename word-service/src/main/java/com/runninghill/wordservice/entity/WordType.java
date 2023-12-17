package com.runninghill.wordservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WordType {

    @Id
    private long id;

    @Column
    private String name;

}
