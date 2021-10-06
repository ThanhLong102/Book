package com.example.book.service;

import com.example.book.dto.OderDto;
import com.example.book.entity.OderEntity;

import java.util.List;

public interface IOderService {
    OderDto create(OderDto oderDto);

    List<OderEntity> display();
}
