package com.example.book.service;


import com.example.book.converter.MangesConverter;
import com.example.book.dto.ManagesOder;
import com.example.book.entity.Oder_ItemEntity;
import com.example.book.repository.ItemRepository;
import com.example.book.repository.ManagesRepository;
import com.example.book.repository.OderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangeService implements IManageService{
    @Autowired
    private MangesConverter mangesConverter;

    @Autowired
    private ManagesRepository managesRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private OderRepository oderRepository;

    @Override
    public List<Oder_ItemEntity> display(){
        return (List<Oder_ItemEntity>)managesRepository.findAll();
    }

    @Override
    public ManagesOder update(ManagesOder managesOder){
        Oder_ItemEntity oder_item =new Oder_ItemEntity();
        if (managesOder.getId() != null) {
            Oder_ItemEntity oldOder_ItemEntity = managesRepository.findOneById(managesOder.getId());
            oder_item = mangesConverter.toEntity(managesOder, oldOder_ItemEntity);
        } else {
            oder_item = mangesConverter.toEntity(managesOder);
        }
        oder_item.setItem(itemRepository.findOneById(managesOder.getItemId()));
        oder_item.setOder(oderRepository.findOneByCode(managesOder.getCode()));
        managesRepository.save(oder_item);
        return managesOder;
    }

}
