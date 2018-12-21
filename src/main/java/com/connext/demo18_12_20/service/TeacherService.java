package com.connext.demo18_12_20.service;

import com.connext.demo18_12_20.dto.TeacherWithCourse;
import com.connext.demo18_12_20.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<TeacherWithCourse> findAll();
    List<TeacherWithCourse> findAllByTeacherName(String teacherName);
    void deletedById(String teacherId);
    void insertOrUpdate(Teacher teacher);
}
