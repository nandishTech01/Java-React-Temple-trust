package com.livewebsite.LiveDemo.services;

import com.livewebsite.LiveDemo.Repository.DemoRepository;
import com.livewebsite.LiveDemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService{

	@Autowired
	private DemoRepository repo;

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers = repo.findAll();
		return customers;
	}

	@Override
	public Customer getCustomerById(Long id) {
		Optional<Customer> customer = repo.findById(id);
		return customer.orElse(null);
	}

	@Override
	public void addCustomer(Customer customer) {
		repo.save(customer);
		
	}

	@Override
	public void updateCustomer(Long id, Customer customer) {
		Optional<Customer> customer1 = repo.findById(id);
		if(customer1.isPresent()) {
			Customer existingCustomer = customer1.get();
			existingCustomer.setFirstName(customer.getFirstName());
			existingCustomer.setLastName(customer.getLastName());
			existingCustomer.setPassword(customer.getPassword());
			existingCustomer.setEmail(customer.getEmail());
		}
		
	}

	@Override
	public void deleteCustomer(Long id) {
	repo.deleteById(id);
	}
	
	
	
}
