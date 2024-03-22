package com.springbootjpademo.controllar;

import com.springbootjpademo.models.Student;
import com.springbootjpademo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student/v1/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }

    @GetMapping("getAllStudent")
    public ResponseEntity<List<Student>> getAllStudent()
    {
        return studentService.getAllStudent();
    }
}
