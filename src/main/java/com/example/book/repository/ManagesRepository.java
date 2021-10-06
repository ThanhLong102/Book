package com.example.book.repository;


import com.example.book.entity.Oder_ItemEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagesRepository extends PagingAndSortingRepository<Oder_ItemEntity,Long> {
    Oder_ItemEntity findOneById(Long id);
}
