package com.sunman.library.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sunman.library.demo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{
	

}
