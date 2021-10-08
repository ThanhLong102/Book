package com.example.book.api;

import com.example.book.entity.Category;
import com.example.book.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class ApiCategory {
    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping(value = "/create")
    public Category createNew(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @GetMapping(value = "/show")
    public List<Category> display(){
        return (List<Category>) categoryRepository.findAll();
    }
}
