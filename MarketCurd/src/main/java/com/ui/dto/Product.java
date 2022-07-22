package com.ui.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curdproduct")
public class Product {
	@Id
	@Column(name="pid")
	int productId; 
	@Column(name = "pname")
	String productName;
	@Column(name="prate")
	int productRate;
	public Product(int productId, String productName, int productRate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productRate = productRate;
	}
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductRate() {
		return productRate;
	}
	public void setProductRate(int productRate) {
		this.productRate = productRate;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productRate=" + productRate
				+ "]";
	} 
	

}
