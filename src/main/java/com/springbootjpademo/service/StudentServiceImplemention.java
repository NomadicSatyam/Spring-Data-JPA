package com.springbootjpademo.service;

import com.springbootjpademo.models.Student;
import com.springbootjpademo.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StudentServiceImplemention implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public ResponseEntity<String> addStudent(Student student) {
        // Ensure to copy the laptop entity
        Student newStudent = Student.builder()
                .name(student.getName())
                .subject(student.getSubject())
                .laptop(student.getLaptop()) // Copy the laptop entity
                .build();

        studentRepository.save(newStudent);

        log.info("User {} is saved", newStudent.getId());

        return ResponseEntity.ok("Student Detail Added Successfully");
    }

    @Override
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> students = studentRepository.findAll();



        return ResponseEntity.ok(students);
    }
}
