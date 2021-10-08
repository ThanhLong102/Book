package com.example.book.repository;

import com.example.book.entity.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {
    Category findOneById(Long id);

    Category findOneByName(String category_name);
}
