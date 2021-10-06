package com.example.book.service;

import com.example.book.dto.ManagesOder;
import com.example.book.entity.Oder_ItemEntity;

import java.util.List;

public interface IManageService {
    List<Oder_ItemEntity> display();

    ManagesOder update(ManagesOder managesOder);
}
