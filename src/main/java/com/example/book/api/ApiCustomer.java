package com.example.book.api;

import com.example.book.entity.CustomerEntity;
import com.example.book.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/customer")
public class ApiCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(value = "/create")
    public CustomerEntity createNew(@RequestBody CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }

    @PutMapping(value = "/update")
    public CustomerEntity update(@RequestBody CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }

    @GetMapping(value = "/show")
    public List<CustomerEntity> display(){
        return (List<CustomerEntity>) customerRepository.findAll();
    }

}
