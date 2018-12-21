package com.connext.demo18_12_20.service.impl;

import com.connext.demo18_12_20.entity.Teacher;
import com.connext.demo18_12_20.repository.TeacherRepository;
import com.connext.demo18_12_20.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public List<Teacher> findAllByTeacherName(String teacherName) {
        return teacherRepository.findAllByTeacherName(teacherName);
    }

    @Override
    public void deletedById(String teacherId) {
        teacherRepository.deleteById(teacherId);
    }

    @Override
    public void insertOrUpdate(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}
