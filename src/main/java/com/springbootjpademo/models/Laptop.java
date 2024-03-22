package com.springbootjpademo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="t_laptop")
@Data

public class Laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String model;
    private String brand;

}
