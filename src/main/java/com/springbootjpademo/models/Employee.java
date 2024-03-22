package com.springbootjpademo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Table(name = "t_employee")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id;
    private String name;
    private String pass;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_emp_id",referencedColumnName = "emp_id",nullable = false)
    private List<Address> address;


}
