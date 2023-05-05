package com.sunman.library.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunman.library.demo.model.Book;
import com.sunman.library.demo.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository repository;

	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		Book newBook = repository.save(book);
		return "Added book ";
	}
	
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return repository.findAll();
	}
	
	
	@GetMapping("/books/{id}")
	public Optional<Book> getBookId(@PathVariable int id) {
		return repository.findById(id);
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "Book deleted";
	}
}
