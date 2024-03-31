package com.livewebsite.LiveDemo.controller;

import com.livewebsite.LiveDemo.entity.Customer;
import com.livewebsite.LiveDemo.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

	@Autowired
	private DemoService service;

	@PostMapping
	public ResponseEntity<Void> addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
		service.updateCustomer(id, customer);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	public ResponseEntity<List<Customer>> getallcustomers() {
		List<Customer> customers = service.getCustomers();
		return new ResponseEntity<>(customers, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
		Customer customer = service.getCustomerById(id);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
		service.deleteCustomer(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
