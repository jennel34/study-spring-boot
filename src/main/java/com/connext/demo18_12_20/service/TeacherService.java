package com.connext.demo18_12_20.service;

import com.connext.demo18_12_20.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAll();
    List<Teacher> findAllByTeacherName(String teacherName);
    void deletedById(String teacherId);
    void insertOrUpdate(Teacher teacher);
}
