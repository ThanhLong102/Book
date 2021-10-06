package com.example.book.converter;

import com.example.book.dto.ManagesOder;
import com.example.book.entity.Oder_ItemEntity;
import org.springframework.stereotype.Component;

@Component
public class MangesConverter {
    public Oder_ItemEntity toEntity(ManagesOder dto) {
        Oder_ItemEntity entity = new Oder_ItemEntity();
        entity.setId(dto.getId());
        entity.setQuantity(dto.getQuantity());
        return entity;
    }

    public ManagesOder toDTO(Oder_ItemEntity entity) {
        ManagesOder dto = new ManagesOder();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setQuantity(dto.getQuantity());
        return dto;
    }

    public Oder_ItemEntity toEntity(ManagesOder dto, Oder_ItemEntity entity) {
        entity.setQuantity(dto.getQuantity());
        return entity;
    }
}
