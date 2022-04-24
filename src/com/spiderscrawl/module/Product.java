package com.spiderscrawl.module;

import java.util.List;

public class Product {
	
	private int productId;
	
	private String productName;
	
	private int productQuantity;
	
	private double productPrice;
	
	private List<Customer> customer;
	
	private List<Spendings> spendings;
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int productQuantity, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
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

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public List<Spendings> getSpendings() {
		return spendings;
	}

	public void setSpendings(List<Spendings> spendings) {
		this.spendings = spendings;
	}
	
	
	

}
