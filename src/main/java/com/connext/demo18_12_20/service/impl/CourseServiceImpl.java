package com.connext.demo18_12_20.service.impl;

import com.connext.demo18_12_20.entity.Course;
import com.connext.demo18_12_20.repository.CourseRepository;
import com.connext.demo18_12_20.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public List<Course> findAllByCourseName(String courseName) {
        return courseRepository.findAllByCourseName(courseName);
    }

    @Override
    public void deleteById(String id) {
        courseRepository.deleteById(id);
    }

    @Override
    public void insertAndUpdate(Course course) {
        courseRepository.save(course);
    }
}
