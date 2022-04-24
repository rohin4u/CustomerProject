package com.spiderscrawl.module;

import java.util.Date;
import java.util.List;

public class Spendings {

	private double totalSpendingAmount;
	
	private Date spendingMonth;
	
	private double spendingOnProduct;
	
	private List<Customer> customer; 
	
	private List<Product> product;
	
	

	public Spendings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Spendings(double totalSpendingAmount, Date spendingMonth, double spendingOnProduct) {
		super();
		
		this.totalSpendingAmount = totalSpendingAmount;
		this.spendingMonth = spendingMonth;
		this.spendingOnProduct = spendingOnProduct;
	}

	

	public double getTotalSpendingAmount() {
		return totalSpendingAmount;
	}

	public void setTotalSpendingAmount(double totalSpendingAmount) {
		this.totalSpendingAmount = totalSpendingAmount;
	}

	public Date getSpendingMonth() {
		return spendingMonth;
	}

	public void setSpendingMonth(Date spendingMonth) {
		this.spendingMonth = spendingMonth;
	}

	public double getSpendingOnProduct() {
		return spendingOnProduct;
	}

	public void setSpendingOnProduct(double spendingOnProduct) {
		this.spendingOnProduct = spendingOnProduct;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	
	
	
	

}
