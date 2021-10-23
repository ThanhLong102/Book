package com.example.book.api;

import com.example.book.dto.CustomerDto;
import com.example.book.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/customer")
public class ApiCustomer {

    @Autowired
    private ICustomerService iCustomerService;

    @PostMapping(value = "/create")
    public CustomerDto createNew(@RequestBody CustomerDto customerDto) {
        return iCustomerService.update(customerDto);
    }

    @PutMapping(value = "/update")
    public CustomerDto update(@RequestBody CustomerDto customerDto) {
        return iCustomerService.update(customerDto);
    }

    @GetMapping(value = "/show")
    public List<CustomerDto> display(){
        return iCustomerService.display();
    }

}
