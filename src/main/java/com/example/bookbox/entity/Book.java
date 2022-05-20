package com.example.bookbox.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "book_id")
    private int book_id;
    
    private long isbn;
    private String title;
	private float price;
    

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

    // @OneToMany(targetEntity = Author.class)
    // private List<Author> authorDetails;
}
