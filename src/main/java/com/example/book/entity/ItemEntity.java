package com.example.book.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name ="item")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String image;

    private Float price;

    private String describes;

    private Long inventory;

    @ManyToOne
    @JoinColumn(name="category_id",referencedColumnName = "id")
    @JsonIgnore
    private Category category;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<Oder_ItemEntity> oder_itemEntityCollection;
}

