package com.example.bookbox.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int author_id;
    
    private String author_name;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "authorDetails")
    Set<Book> books;
    
    public int getAuthor_id() {
        return author_id;
    }
    
    public String getAuthor_name() {
        return author_name;
    }    
    
    public Set<Book> getBooks() {
        return books;
    }
}
