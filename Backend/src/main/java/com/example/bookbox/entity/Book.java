package com.example.bookbox.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_id;
    
    private long isbn;
    private String title;
	private float price;
    
    @ManyToMany
    @JoinTable(name = "book_author", 
    joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authorDetails;

    public int getBook_id() {
        return book_id;
    }

    public long getIsbn() {
        return isbn;
    }

	public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public Set<Author> getAuthorDetails() {
        return authorDetails;
    }
    
}
