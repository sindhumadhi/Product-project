package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.product.Product;
import com.product.dao.ProductDao;


@Service
public class ProductService {

	@Autowired
	ProductDao pd;
	
	public String postAll( List<Product> a)
	{
		return pd.postAll(a);
	}
	
	public List<Product> getAll()
	{
		return pd.getAll();
	}

	
}
