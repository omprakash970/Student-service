package com.example.studentservice.controller;


import com.example.studentservice.entity.Student;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
       return studentService.getStudent(id);
    }
}
