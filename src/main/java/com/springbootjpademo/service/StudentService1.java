package com.springbootjpademo.service;


import com.springbootjpademo.models.Student1;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface StudentService1 {

    public ResponseEntity<String> add(Student1 student);
    public ResponseEntity<List<Student1>> getAll();
}
