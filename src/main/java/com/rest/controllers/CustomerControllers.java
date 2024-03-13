package com.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Customer;
import com.rest.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerControllers {
	@Autowired
	private CustomerService service;
//Add single data	
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
//fetch single data
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable("id") int id) {
		return service.getCustomer(id);
	}
	
//add list of customer and it address
	@PostMapping("/addlist")
	public List<Customer> addCustomerList(@RequestBody List<Customer> customers){
		return service.addCustomerList(customers);
	}
// update the details of customer
	@PutMapping
	public Customer updateCustomerDetails(@RequestBody Customer customer) {
		return service.updateCustomerDetails(customer);
	}
}


