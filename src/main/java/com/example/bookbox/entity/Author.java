package com.example.bookbox.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Author {
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "author_id")
    private int author_id;
    
    private String author_name;
    
    public Author(int author_id, String author_name) {
        this.author_id = author_id;
        this.author_name = author_name;
    }


}
