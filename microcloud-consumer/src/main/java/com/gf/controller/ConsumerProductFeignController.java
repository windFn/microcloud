package com.gf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gf.entry.Product;
import com.gf.service.ProductService;
import com.gf.service.ProductServiceTwo;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-21
 */
@RestController
@RequestMapping("/consumerFeign")
public class ConsumerProductFeignController {
	@Autowired
	ProductService productService;
	@Autowired
	ProductServiceTwo productServiceTwo;
	@RequestMapping("/get/{id}")
	public Product get(@PathVariable Integer id){
		return productService.get(id);
	}
	
	@RequestMapping("/add")
	public boolean add(@RequestBody Product product){
		return productService.add(product);
	}
	
	@RequestMapping("/list")
	public List<Product> list(){
		return productService.list();
	}
	
	@RequestMapping("/get_/{id}")
	public Product get_(@PathVariable Integer id){
		return productServiceTwo.get(id);
	}
	
	@RequestMapping("/add_")
	public boolean add_(@RequestBody Product product){
		return productServiceTwo.add(product);
	}
	
	@RequestMapping("/list_")
	public List<Product> list_(){
		return productServiceTwo.list();
	}
}
