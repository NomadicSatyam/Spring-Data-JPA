package com.springbootjpademo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="t_laptop1")
@Data
public class Laptop1 {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String model;
    private String brand;

    @JsonIgnore
    @OneToOne(mappedBy = "laptop1")
    private Student1 student1;
}
