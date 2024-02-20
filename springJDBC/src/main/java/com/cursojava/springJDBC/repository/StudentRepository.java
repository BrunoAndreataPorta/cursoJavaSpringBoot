package com.cursojava.springJDBC.repository;

import com.cursojava.springJDBC.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public void save(Student s) {
        System.out.println("Added...");
    }


    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();
        return students;

    }
}
