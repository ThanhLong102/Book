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

    private String type;

    private Float price;

    private String author;

    private Long republish;

    private String cover;
}
