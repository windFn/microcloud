package com.gf.entry;

import java.io.Serializable;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-01
 */
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer productId;
	private String productName;
	private String productDesc;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
}
