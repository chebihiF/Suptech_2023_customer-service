package com.example.customerservicebp.repositories;

import com.example.customerservicebp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
