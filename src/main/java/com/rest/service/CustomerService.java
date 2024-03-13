package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.entity.Customer;
import java.util.*;
import com.rest.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo customerRepo;
// adding single data	
	public Customer addCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}
//geting simple data
	public Customer getCustomer(int id) {
		return customerRepo.findById(id).get();
	}
	
//Adding multiple data 

	public List<Customer> addCustomerList(List<Customer> list){
		return customerRepo.saveAll(list);
	}
	
//Update customer details
	
	public Customer updateCustomerDetails(Customer customer) {
		int id=customer.getId();
		Customer customer2 = customerRepo.findById(id).get();
		
		customer2.setAddress(customer.getAddress());
		customer2.setName(customer.getName());
		customerRepo.save(customer2);
		return customer2;
	}
}
