package com.springbootjpademo.service;

import com.springbootjpademo.models.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {

    public ResponseEntity<String> addStudent(Student student);
    public ResponseEntity<List<Student>> getAllStudent();
}
