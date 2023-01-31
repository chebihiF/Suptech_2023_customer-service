package com.example.customerservicebp.config;

import com.example.customerservicebp.dto.CustomerRequestDTO;
import com.example.customerservicebp.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    private final CustomerService customerService;

    public CustomerConfig(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Bean
    CommandLineRunner initCustomers() {
        return args -> {
          customerService.save(new CustomerRequestDTO(0L,"Chebihi","chebihi@gmail.com"));
        };
    }
}
