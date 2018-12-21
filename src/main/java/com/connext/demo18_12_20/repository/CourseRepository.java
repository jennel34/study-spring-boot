package com.connext.demo18_12_20.repository;

import com.connext.demo18_12_20.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,String> {
}
