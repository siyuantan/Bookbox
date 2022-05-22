package com.example.bookbox.repository;

import java.util.List;

import com.example.bookbox.entity.Book;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer>{
    @Query(value = "SELECT * FROM book " +
    "RIGHT JOIN book_author ON book.book_id = book_author.book_id " +
    "INNER JOIN author ON book_author.author_id = author.author_id " + 
    "WHERE book.title LIKE %?1%", nativeQuery = true)
    List<Book> findByTitle(String title);
}
