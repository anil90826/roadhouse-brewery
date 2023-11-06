package com.roadhousebre.services;

import com.roadhousebre.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(String customerId) {
        return CustomerDto.builder().customerId(UUID.randomUUID())
                .customerName("Anil Gubbala")
                .build();
    }
}
