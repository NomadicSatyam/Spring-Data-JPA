package com.springbootjpademo.service;


import com.springbootjpademo.models.Student1;
import com.springbootjpademo.repository.StudentRepository1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentServiceImplemention1 implements StudentService1 {

    @Autowired
    private StudentRepository1 studentRepository1;



    @Override
    public ResponseEntity<String> add(Student1 student) {

        Student1 student1=Student1.builder()
                .name(student.getName())
                .subject(student.getSubject())
                .laptop1(student.getLaptop1())
                .build();

        studentRepository1.save(student1);
        log.info("User {} is saved", student.getId());

        return ResponseEntity.ok("Student Detail Added Successfully");
    }

    @Override
    public ResponseEntity<List<Student1>> getAll() {

        List<Student1> student1s=studentRepository1.findAll();

        return ResponseEntity.ok(student1s);
    }


}
