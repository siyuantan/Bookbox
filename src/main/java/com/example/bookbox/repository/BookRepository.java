package com.example.bookbox.repository;

import java.util.List;

import com.example.bookbox.entity.Book;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{
    @Query(value = "SELECT * FROM book WHERE title LIKE %?1%", nativeQuery = true)
    List<Book> findByTitle(String title);
}
