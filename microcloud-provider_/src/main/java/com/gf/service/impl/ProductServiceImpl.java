package com.gf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gf.entry.Product;
import com.gf.mapper.ProductMapper;
import com.gf.service.ProductService;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-01
 */
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductMapper mapper;
	@Override
	public Product getById(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	@Transactional
	@Override
	public boolean add(Product product) {
		int i = mapper.insert(product);
		return i == 1;
	}

	@Override
	public List<Product> list() {
		return mapper.selectAll();
	}

}
