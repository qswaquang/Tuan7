package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Product;


public interface ProductRepository extends JpaRepository<Product, String> {
	public Product findByName();
}
