package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

	
	public List<Book> findByBookPriceGreaterThan(Double price);
	
	public List<Book>  findByBookName(String name);
}
