package com.example.practical_exam.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;
}
