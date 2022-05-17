package com.example.bookbox.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.example.bookbox.entity.Book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BookController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Book greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Book(counter.incrementAndGet(), String.format(template, name));
	}
}
