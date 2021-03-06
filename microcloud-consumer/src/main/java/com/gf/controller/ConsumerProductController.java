package com.gf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gf.entry.Product;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-01
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping("/get/{id}")
	public Product get(@PathVariable Integer id){
		return restTemplate.getForEntity("http://microcloud-provider/product/get/"+id, Product.class).getBody();
	}
	
	@RequestMapping("/add")
	public boolean add(@RequestBody Product product){
		return restTemplate.postForEntity("http://microcloud-provider/product/add/", product, boolean.class).getBody();
	}
	
	@RequestMapping("/list")
	public List<Product> list(){
		return restTemplate.getForEntity("http://microcloud-provider/product/list", List.class).getBody();
	}
	
	@RequestMapping("/get_/{id}")
	public Product get_(@PathVariable Integer id){
		return restTemplate.getForEntity("http://microcloud-provider-two/product/get/"+id, Product.class).getBody();
	}
	
	@RequestMapping("/add_")
	public boolean add_(@RequestBody Product product){
		return restTemplate.postForEntity("http://microcloud-provider-two/product/add/", product, boolean.class).getBody();
	}
	
	@RequestMapping("/list_")
	public List<Product> list_(){
		return restTemplate.getForEntity("http://microcloud-provider-two/product/list", List.class).getBody();
	}
}
