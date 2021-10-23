package com.example.book.service;

import com.example.book.dto.CustomerDto;
import com.example.book.entity.CustomerEntity;

import java.util.List;

public interface ICustomerService {
    List<CustomerEntity> display();

    CustomerDto update(CustomerDto customerDto);
}
