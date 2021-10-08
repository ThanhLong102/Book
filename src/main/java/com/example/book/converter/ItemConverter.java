package com.example.book.converter;

import com.example.book.dto.ItemDto;
import com.example.book.entity.ItemEntity;
import org.springframework.stereotype.Component;

@Component
public class ItemConverter {
    public ItemEntity toEntity(ItemDto dto) {
        ItemEntity entity = new ItemEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescribes(dto.getDescribes());
        entity.setImage(dto.getImage());
        entity.setPrice(dto.getPrice());
        entity.setInventory(dto.getInventory());
        return entity;
    }

    public ItemDto toDTO(ItemEntity entity) {
        ItemDto dto = new ItemDto();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setName(entity.getName());
        dto.setDescribes(entity.getDescribes());
        dto.setImage(entity.getImage());
        dto.setPrice(entity.getPrice());
        dto.setInventory(entity.getInventory());
        return dto;
    }

    public ItemEntity toEntity(ItemDto dto, ItemEntity entity) {
        entity.setName(dto.getName());
        entity.setDescribes(dto.getDescribes());
        entity.setImage(dto.getImage());
        entity.setPrice(dto.getPrice());
        entity.setInventory(dto.getInventory());
        return entity;
    }
}
