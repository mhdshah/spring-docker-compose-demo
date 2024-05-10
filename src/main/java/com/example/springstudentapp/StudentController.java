package com.example.springstudentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent(){
        Student student = new Student();
        student.setName("EEE");
        student.setAge(28);
        repo.save(student);
    }
}
