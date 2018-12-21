package com.connext.demo18_12_20.service;

import com.connext.demo18_12_20.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    List<Course> findAllByCourseName(String courseName);
    void deleteById(String id);
    void insertAndUpdate(Course course);
}
