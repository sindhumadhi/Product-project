package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.Product;

public interface ProductRepositary extends JpaRepository<Product, Integer>
{

}
