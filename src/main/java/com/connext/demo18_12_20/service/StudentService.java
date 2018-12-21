package com.connext.demo18_12_20.service;

import com.connext.demo18_12_20.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    List<Student> findAllByStudentName(String studentName);
    void insertAndUpdate(Student student);
    void deleteById(String id);
}
