package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		ProductRepository productRepo = context.getBean(ProductRepository.class);
		
		productRepo.getAllProducts().forEach(System.out::println);

	}
}