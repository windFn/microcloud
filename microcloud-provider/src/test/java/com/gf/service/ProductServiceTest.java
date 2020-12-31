package com.gf.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gf.common.BaseTest;
import com.gf.entry.Product;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-01
 */
public class ProductServiceTest extends BaseTest{
	@Autowired
	ProductService service;
	@Test
	public void testGetById() {
	}

	@Test
	public void testAdd() {
		Product product = new Product();
		product.setProductId(2);
		product.setProductName("one");
		service.add(product);
	}

	@Test
	public void testList() {
	}

}
