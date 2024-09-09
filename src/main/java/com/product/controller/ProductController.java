package com.product.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.product.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/Product")
public class ProductController 
{
	@Autowired
	ProductService ps;
	
	@PostMapping(value = "/post")
	public String postAll(@RequestBody List<Product> a)
	{
		return ps.postAll(a);
	}
	
	@GetMapping(value ="/getall")
	public List<Product> getAll()
	{
		return ps.getAll();
	}
}
