package com.springbootjpademo.controllar;

import com.springbootjpademo.dto.EmployeeResponse;
import com.springbootjpademo.models.Employee;
import com.springbootjpademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody Employee emp)
    {
        return employeeService.addEmployee(emp);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<EmployeeResponse>> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }

    @GetMapping("get")
    public ResponseEntity<List<Employee>> getAll()
    {
        return employeeService.getAll();
    }
}
