package com.sunman.library.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Book")
public class Book {

	@Id
	private int id;
	private String book_name;
	private String book_author;
	
	
	public Book() {
		super();
	}


	public Book(int id, String book_name, String book_author) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.book_author = book_author;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", book_name=" + book_name + ", book_author=" + book_author + "]";
	}
}
