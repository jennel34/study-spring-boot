package com.connext.demo18_12_20.service.impl;

import com.connext.demo18_12_20.entity.Student;
import com.connext.demo18_12_20.repository.StudentRepository;
import com.connext.demo18_12_20.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudnetServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findAllByStudentName(String studentName) {
        return studentRepository.findAllByStudentName(studentName);
    }

    @Override
    public void insertAndUpdate(Student student) {
        if(student.getId() == null || student.getId().equals("")){
            student.setId(UUID.randomUUID().toString());
        }
        studentRepository.save(student);
    }

    @Override
    public void deleteById(String id) {
        studentRepository.deleteById(id);
    }
}
