package com.gf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gf.entry.Product;
import com.gf.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-01
 */
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	DiscoveryClient discoverClient;
	@Autowired
	ProductService service;
	@RequestMapping("/get/{id}")
	@HystrixCommand(fallbackMethod="fallBackGet")
	public Product get(@PathVariable Integer id){
		Product product = service.getById(id);
		if(product == null)
			throw new RuntimeException("模拟异常");
		return product;
	}
	
	public Product fallBackGet(@PathVariable Integer id){
		Product product = new Product();
		product.setProductId(id);
		product.setProductName("hystrix product");
		product.setProductDesc("降级处理");
		return product;
	}
	
	@RequestMapping("/add")
	public boolean add(@RequestBody Product product){
		return service.add(product);
	}
	
	@RequestMapping("/list")
	public List<Product> list(){
		return service.list();
	}
	
	@RequestMapping("/getDiscoveryClient")
	public DiscoveryClient getDiscoveryClient(){
		return this.discoverClient;
	}
}
