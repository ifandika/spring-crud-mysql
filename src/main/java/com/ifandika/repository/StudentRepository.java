package com.ifandika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifandika.data.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
