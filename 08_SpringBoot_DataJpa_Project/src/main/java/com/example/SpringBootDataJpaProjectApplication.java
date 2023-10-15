package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Book;
import com.example.repo.BookRepository;

@SpringBootApplication
public class SpringBootDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringBootDataJpaProjectApplication.class, args);

		BookRepository repo = ctxt.getBean(BookRepository.class);
		
//		Iterable<Book> findAll = repo.findAll();
//		
//		for(Book b :findAll ) {
//			System.out.println(b);
//		}
	
         //To Find interface implementation class name
//		String name = bean.getClass().getName();
//		System.out.println(name);

		/*
		 To save single record in database
		 
		Book b = new Book();
		b.setBookId(102);
		b.setBookName("AWS");
		b.setBookPrice(750.00);
		repo.save(b);
		System.out.println("Recorded Inserted");*/
		

		List<Book> findByBookPriceGreaterThan = repo.findByBookPriceGreaterThan(500.00);
		for(Book b :findByBookPriceGreaterThan) {
			System.out.println(b);
		}
			
			List<Book> findByBookName = repo.findByBookName("Spring");
			for(Book b1:findByBookName) {
				System.out.println(b1);
			}
		}
	}


