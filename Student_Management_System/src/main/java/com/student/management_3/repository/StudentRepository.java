package com.student.management_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.management_3.entities.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
