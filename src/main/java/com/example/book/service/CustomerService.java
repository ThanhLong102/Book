package com.example.book.service;


import com.example.book.converter.CustomerConverter;
import com.example.book.dto.CustomerDto;
import com.example.book.entity.CustomerEntity;
import com.example.book.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerConverter customerConverter;

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<CustomerEntity> display(){
        List<CustomerEntity> customerEntities = (List<CustomerEntity>) customerRepository.findAll();
        return customerEntities;
    }

    @Override
    public CustomerDto update(CustomerDto customerDto){
        CustomerEntity customerEntity =new CustomerEntity();
        if (customerDto.getId() != null) {
            CustomerEntity oldCustomer = customerRepository.findOneById(customerDto.getId());
            customerEntity = customerConverter.toEntity(customerDto, oldCustomer);
        } else {
            customerEntity = customerConverter.toEntity(customerDto);
        }
        customerEntity = customerRepository.save(customerEntity);
        return customerConverter.toDTO(customerEntity);
    }


}
