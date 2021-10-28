package com.example.book.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ItemDto {
    private Long id;

    private String name;

    private String image;

    private Float price;

    private String describes;

    private Long inventory;

    private String category_name;
}
