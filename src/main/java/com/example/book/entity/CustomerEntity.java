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
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String address;

    private String phone;

    private String account;

    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id",referencedColumnName = "id")
    private Collection<OderEntity> oder;
}
