package com.springbootjpademo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "t_address")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    private String state;

}
