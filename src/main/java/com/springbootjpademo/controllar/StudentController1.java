package com.springbootjpademo.controllar;


import com.springbootjpademo.models.Student1;
import com.springbootjpademo.service.StudentService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student/v2/")
public class StudentController1 {

    @Autowired
    private StudentService1 studentService1;

    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody Student1 student1)
    {
        return  studentService1.add(student1);
    }

    @GetMapping("getall")
    public ResponseEntity<List<Student1>> getall()
    {
        return studentService1.getAll();
    }
}
