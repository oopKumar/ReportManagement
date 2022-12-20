package com.oop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oop.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
