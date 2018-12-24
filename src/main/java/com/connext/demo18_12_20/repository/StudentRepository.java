package com.connext.demo18_12_20.repository;

import com.connext.demo18_12_20.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student , String > {
    List<Student> findAllByStudentNameLike(String studentName);
}
