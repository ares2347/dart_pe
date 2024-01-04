package com.example.practical_exam.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer wage;
}
