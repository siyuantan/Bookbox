// package com.example.bookbox.usecase;

// import java.util.List;

// import com.example.bookbox.entity.Book;
// import com.example.bookbox.repository.BookRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class BookUseCase {
//     @Autowired
//     private final BookRepository bookRepository;

//     public BookUseCase(BookRepository bookRepository) {
//         this.bookRepository = bookRepository;
//     }

//     public Iterable<Book> getAllBooks() {
//         return bookRepository.findAll();
//     }
// }
