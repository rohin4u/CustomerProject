package com.spiderscrawl.repository;

import java.util.List;

import com.spiderscrawl.module.Customer;

public interface CustomerRepository {
	
	public String addCustomer();
	
	public Customer findCustomer(int id);
	
	public List<Customer> findAllCustomer();
	
	public String deleteCustomer(int id);

}
