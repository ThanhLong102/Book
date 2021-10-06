package com.example.book.service;

import com.example.book.dto.ItemDto;

import java.util.List;

public interface IItemService {
    List<ItemDto> display();

    ItemDto update(ItemDto itemDto);

    ItemDto getItemId(long id);

    void delete(long id);
}
