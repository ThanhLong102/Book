package com.example.book.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private Collection<ItemEntity> itemEntities;
}
