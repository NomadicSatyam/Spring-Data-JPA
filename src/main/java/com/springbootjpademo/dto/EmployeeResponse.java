package com.springbootjpademo.dto;

import com.springbootjpademo.models.Address;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeResponse {

    private int id;
    private String name;
    private String pass;
    private List<Address> address;
}
