package com.product.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.Product;
import com.product.repo.ProductRepositary;

@Repository
public class ProductDao 
{
	@Autowired
	ProductRepositary pr;
	
	public String postAll( List<Product> a)
	{
		 pr.saveAll(a);
		 return "posted";
	}
	
	public List<Product> getAll()
	{
		return pr.findAll();
	}

}
