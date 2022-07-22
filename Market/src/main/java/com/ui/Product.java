package com.ui;
import javax.persistence.Column;
import javax.persistence.*;
@Entity
@Table(name="product")
public class Product {
	 @Id
	@Column(name="pid")
	int productid;
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productrate=" + productrate
				+ "]";
	}
	@Column(name="pname",length=20)
	String productname;
	@Column(name="prate")
	int productrate;
	public Product(int productid, String productname, int productrate) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productrate = productrate;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductrate() {
		return productrate;
	}
	public void setProductrate(int productrate) {
		this.productrate = productrate;
	}
	public Product() {
		super();
	}
	
	

}