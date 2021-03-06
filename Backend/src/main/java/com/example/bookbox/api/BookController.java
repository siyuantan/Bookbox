package com.example.bookbox.api;

import java.util.List;

import com.example.bookbox.entity.Book;
import com.example.bookbox.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookController {
	
	@Autowired
	private BookRepository bookRepo;
		
	@GetMapping("/books")
	public @ResponseBody Iterable<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
	@GetMapping("/book")
	public @ResponseBody List<Book> findBook(@RequestParam(value = "title", defaultValue = "") String title) {
		return bookRepo.findByTitle(title);
	}
}
