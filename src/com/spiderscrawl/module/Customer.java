package com.spiderscrawl.module;

import java.util.List;

public class Customer {
	
	private int customerId;
	
	private String customerName;
	
	private int customerAge;
	
	private double customerIncome;
	
	private String customerAddress;
	
	private List<Product> product;
	
	private List<Spendings> spending;
	
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, int customerAge, double customerIncome, String customerAddress,
			List<Product> product, List<Spendings> spending) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.customerIncome = customerIncome;
		this.customerAddress = customerAddress;
		this.product = product;
		this.spending = spending;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public double getCustomerIncome() {
		return customerIncome;
	}

	public void setCustomerIncome(double customerIncome) {
		this.customerIncome = customerIncome;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public List<Spendings> getSpending() {
		return spending;
	}

	public void setSpending(List<Spendings> spending) {
		this.spending = spending;
	}

	@Override
	public String toString() {
		return "Employee [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", customerIncome=" + customerIncome + ", customerAddress=" + customerAddress + ", product=" + product
				+ ", spending=" + spending + "]";
	}
	
	
}
