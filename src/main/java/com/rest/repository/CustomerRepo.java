package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
