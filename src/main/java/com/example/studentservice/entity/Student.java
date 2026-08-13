package com.example.studentservice.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name="student")
public class Student {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter
    private String name;
    @Getter
    private String department;
    public Student(){
    }
    public Student(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }


}
