package com.gf.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gf.config.FeignConfig;
import com.gf.entry.Product;
import com.gf.service.impl.FallBackProduct;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-21
 */
@FeignClient(name="microcloud-provider",configuration=FeignConfig.class,fallback=FallBackProduct.class)
public interface ProductService {
	@RequestMapping("/product/get/{id}")
	public Product get(@PathVariable(value="id") Integer id);
	
	@RequestMapping("/product/add")
	public boolean add(@RequestBody Product product);
	
	@RequestMapping("/product/list")
	public List<Product> list();
}
