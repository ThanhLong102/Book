package com.example.book.service;

import com.example.book.dto.CustomerDto;

import java.util.List;

public interface ICustomerService {
    List<CustomerEntity> display();

    CustomerDto update(CustomerDto customerDto);
}
