package com.spiderscrawl.repositoryimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.spiderscrawl.configuration.MySqlSetup;
import com.spiderscrawl.module.Customer;
import com.spiderscrawl.repository.CustomerRepository;

public class CustomerRepositoryImpl implements CustomerRepository{
	
	MySqlSetup setup = new MySqlSetup();

	@Override
	public String addCustomer(){
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Customer id : ");
			int customerId = sc.nextInt();
			
			System.out.println("Enter Customer Name : ");
			String customerName = sc.next();
			
			System.out.println("Enter Customer Age : ");
			int customerAge = sc.nextInt();
			
			System.out.println("Enter Customer Income :");
			double customerIncome = sc.nextDouble();
			
			System.out.println("Enter Customer Address : ");
			String customerAddress = sc.next();
			Connection con = setup.getConnection();
			try {
				PreparedStatement pst = con.prepareStatement("insert into Customer values(?,?,?,?,?)");
				
				pst.setInt(1, customerId);
				pst.setString(2, customerName);
				pst.setInt(3, customerAge);
				pst.setDouble(4, customerIncome);
				pst.setString(5, customerAddress);
				
				int count = pst.executeUpdate();
				System.out.println(count+" record is updated");
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
				con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("Customer is added successfully..Do you want to add more type yes or no : ");
			String moreDetails = sc.next();

			if(moreDetails.equalsIgnoreCase("yes")) {
				continue;
			}else {
				break;
			}
		}
		return "Customer details are added successfully";
		
	}

	@Override
	public Customer findCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
