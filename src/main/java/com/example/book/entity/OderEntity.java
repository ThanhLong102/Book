package com.example.book.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "oder")
public class OderEntity {

    @Id
    private String code;

    @CreationTimestamp
    private Date creatDate;

    private Float cost;

    private Long total_product;
}
