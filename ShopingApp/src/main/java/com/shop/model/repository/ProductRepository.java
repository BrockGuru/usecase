package com.shop.model.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
