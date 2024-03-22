package com.springbootjpademo.service;

import com.springbootjpademo.dto.EmployeeResponse;
import com.springbootjpademo.models.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {

    public ResponseEntity<String> addEmployee(Employee emp);

    public ResponseEntity<List<EmployeeResponse>> getAllEmployee();

    public ResponseEntity<List<Employee>> getAll();
}
