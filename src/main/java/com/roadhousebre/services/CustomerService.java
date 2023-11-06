package com.roadhousebre.services;

import com.roadhousebre.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(String customerId);
}
