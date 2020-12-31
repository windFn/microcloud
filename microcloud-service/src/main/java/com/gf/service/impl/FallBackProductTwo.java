package com.gf.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gf.entry.Product;
import com.gf.service.ProductServiceTwo;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-23
 */
@Component
public class FallBackProductTwo implements ProductServiceTwo{

	@Override
	public Product get(Integer id) {
		Product product = new Product();
		product.setProductId(id);
		product.setProductDesc("降级处理");
		product.setProductName("hystrix 降级处理");
		return product;
	}

	@Override
	public boolean add(Product product) {
		return false;
	}

	@Override
	public List<Product> list() {
		ArrayList<Product> arrayList = new ArrayList<Product>();
		Product product = new Product();
		product.setProductId(9999);
		product.setProductDesc("降级处理");
		product.setProductName("hystrix 降级处理");
		arrayList.add(product);
		return arrayList;
	}

}
