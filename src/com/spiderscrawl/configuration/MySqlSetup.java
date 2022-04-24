package com.spiderscrawl.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.spiderscrawl.repository.CustomerRepository;
import com.spiderscrawl.repositoryimpl.CustomerRepositoryImpl;

public class MySqlSetup {
	
	public Connection getConnection(){
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdatabaseforproduct", "root", "root");
		} catch (SQLException|ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		return con;
	}
	
	public static void main(String[] args) {
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		String message = customerRepository.addCustomer();
		System.out.println(message);
	}
	
}
