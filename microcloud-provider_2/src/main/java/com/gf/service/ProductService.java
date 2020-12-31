package com.gf.service;

import java.util.List;

import com.gf.entry.Product;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-01
 */
public interface ProductService {
	public Product getById(Integer id);
	
	public boolean add(Product product);
	
	public List<Product> list();
}
