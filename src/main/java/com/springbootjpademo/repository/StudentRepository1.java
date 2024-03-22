package com.springbootjpademo.repository;

import com.springbootjpademo.models.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository1 extends JpaRepository<Student1,Integer> {
}
