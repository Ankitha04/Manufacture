package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired 
	ProductRepository productRepository;

	public Iterable<Product> getProductDetail() {
		return productRepository.findAll();
	}

	public Optional<Product> getProductDetails(Integer productId) {
		return productRepository.findById(productId);
	}

	@Transactional
	public void saveProduct(@Valid Product product) {
		productRepository.save(product);
	}
	
    @Transactional
	public void deleteProduct(Integer productId) {
		productRepository.deleteById(productId);
	}
    
    @Transactional
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
}