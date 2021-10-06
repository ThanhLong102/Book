package com.example.book.repository;

import com.example.book.entity.ItemEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends PagingAndSortingRepository<ItemEntity,Long> {

    ItemEntity findOneById(Long id);
}
