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
        entity.setType(dto.getType());
        entity.setAuthor(dto.getAuthor());
        entity.setPrice(dto.getPrice());
        entity.setRepublish(dto.getRepublish());
        entity.setCover(dto.getCover());
        return entity;
    }

    public ItemDto toDTO(ItemEntity entity) {
        ItemDto dto = new ItemDto();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setName(entity.getName());
        dto.setType(entity.getType());
        dto.setAuthor(entity.getAuthor());
        dto.setPrice(entity.getPrice());
        dto.setRepublish(entity.getRepublish());
        dto.setCover(entity.getCover());
        return dto;
    }

    public ItemEntity toEntity(ItemDto dto, ItemEntity entity) {
        entity.setName(dto.getName());
        entity.setType(dto.getType());
        entity.setAuthor(dto.getAuthor());
        entity.setPrice(dto.getPrice());
        entity.setRepublish(dto.getRepublish());
        entity.setCover(dto.getCover());
        return entity;
    }
}
