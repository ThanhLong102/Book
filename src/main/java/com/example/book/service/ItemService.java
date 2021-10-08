package com.example.book.service;

import com.example.book.converter.ItemConverter;
import com.example.book.dto.ItemDto;
import com.example.book.entity.Category;
import com.example.book.entity.ItemEntity;
import com.example.book.repository.CategoryRepository;
import com.example.book.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ItemService implements IItemService{

    @Autowired
    private ItemConverter itemConverter;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<ItemDto> display(){
        List<ItemEntity> itemEntities = (List<ItemEntity>) itemRepository.findAll();
        List<ItemDto> itemDtos=new ArrayList<>();
        for (ItemEntity a : itemEntities){
            itemDtos.add(itemConverter.toDTO(a));
        }
        return itemDtos;
    }

    @Override
    public ItemDto update(ItemDto itemDto){
        ItemEntity itemEntity =new ItemEntity();
        Category category=categoryRepository.findOneByName(itemDto.getCategory_name());
        if (itemDto.getId() != null) {
            ItemEntity oldItemEntity = itemRepository.findOneById(itemDto.getId());
            itemEntity = itemConverter.toEntity(itemDto, oldItemEntity);
        } else {
            itemEntity = itemConverter.toEntity(itemDto);
        }
        category.getItemEntities().add(itemEntity);
        itemEntity = itemRepository.save(itemEntity);
        return itemConverter.toDTO(itemEntity);
    }

    @Override
    public ItemDto getItemId(long id){
        ItemEntity itemEntity= itemRepository.findOneById(id);
        return itemConverter.toDTO(itemEntity);
    }

    @Override
    public void delete(long id) {
        ItemEntity newEntity=itemRepository.findOneById(id);
        itemRepository.delete(newEntity);
    }
}
