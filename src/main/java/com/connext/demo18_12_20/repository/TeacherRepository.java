package com.connext.demo18_12_20.repository;

import com.connext.demo18_12_20.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher,String> {
    List<Teacher> findAllByTeacherName(String teacherName);
}
