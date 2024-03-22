package com.springbootjpademo.service;

import com.springbootjpademo.dto.EmployeeResponse;
import com.springbootjpademo.models.Employee;
import com.springbootjpademo.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseEntity<String> addEmployee(Employee emp) {

        Employee emp1=Employee.builder()
                .id(emp.getId())
                .name(emp.getName())
                .pass(emp.getPass())
                .address(emp.getAddress())
                .build();

        employeeRepository.save(emp1);
        log.info("Employee { }Add Successfully",emp.getName());

        return ResponseEntity.ok("Employee Added Successfully");
    }

    @Override
    public ResponseEntity<List<EmployeeResponse>> getAllEmployee() {

        List<Employee> employees=employeeRepository.findAll();

        List<EmployeeResponse> employeeResponses=employees.stream().map(e->modelMapper.map(e,EmployeeResponse.class))
                .collect(Collectors.toList());

        return ResponseEntity.ok(employeeResponses);
    }

    @Override
    public ResponseEntity<List<Employee>> getAll() {
        List<Employee> employees=employeeRepository.findAll();

        return ResponseEntity.ok(employees);
    }


}
