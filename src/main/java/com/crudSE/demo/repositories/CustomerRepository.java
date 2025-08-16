package com.crudSE.demo.repositories;

import com.crudSE.demo.models.Customer.Customer;
import com.crudSE.demo.models.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
  
  boolean existsByEmail(String email);
  
  Optional<Customer> findByEmail(String email);
}
