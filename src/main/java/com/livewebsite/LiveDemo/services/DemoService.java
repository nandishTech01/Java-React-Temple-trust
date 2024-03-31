package com.livewebsite.LiveDemo.services;

import com.livewebsite.LiveDemo.entity.Customer;

import java.util.List;

public interface DemoService {

	public List<Customer> getCustomers();
	
	Customer getCustomerById(Long id);
	
	void addCustomer(Customer customer);

    void updateCustomer(Long id, Customer customer);

    void deleteCustomer(Long id);
	
}
