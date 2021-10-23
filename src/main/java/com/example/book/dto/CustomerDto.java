package com.example.book.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CustomerDto {
    private String name;

    private String email;

    private String address;

    private String telephone;

}
