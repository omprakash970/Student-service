package com.example.studentservice.service;


import com.example.studentservice.entity.Student;
import com.example.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public Student save(Student student){
        return repository.save(student);
    }
    public List<Student> getAllStudents() {

        return repository.findAll();
    }
    public Student getStudent(Integer id){
        return repository.findById(id).orElse(null);
    }

}
