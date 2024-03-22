package com.springbootjpademo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_student1")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String subject;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_foreign_key",referencedColumnName = "id")
    private Laptop1 laptop1;
}
