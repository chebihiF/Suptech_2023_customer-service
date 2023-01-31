package com.example.customerservicebp.mappers;

import com.example.customerservicebp.dto.CustomerRequestDTO;
import com.example.customerservicebp.dto.CustomerResponseDTO;
import com.example.customerservicebp.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerResponseDTO (Customer customer);
    Customer customerRequestDtoToCustomer(CustomerRequestDTO customerRequestDTO);
}
