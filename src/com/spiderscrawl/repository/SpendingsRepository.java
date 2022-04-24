package com.spiderscrawl.repository;

import java.util.Date;

import com.spiderscrawl.module.Product;

public interface SpendingsRepository {
	
	public double addTotalSpending(double amount);
	
	public String addMonth(Date date);
	
	public double spendingOnProduct(Product product);
	

}
