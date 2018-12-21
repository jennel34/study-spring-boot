package com.connext.demo18_12_20.service.impl;

import com.connext.demo18_12_20.dto.TeacherWithCourse;
import com.connext.demo18_12_20.entity.Course;
import com.connext.demo18_12_20.entity.Teacher;
import com.connext.demo18_12_20.repository.CourseRepository;
import com.connext.demo18_12_20.repository.TeacherRepository;
import com.connext.demo18_12_20.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<TeacherWithCourse> findAll() {
        List<TeacherWithCourse> list=new ArrayList<>();
        List<Teacher>teacherList=teacherRepository.findAll();
        for (Teacher t:teacherList){
            TeacherWithCourse teacherWithCourse=new TeacherWithCourse();
            teacherWithCourse.setId(t.getId());
            teacherWithCourse.setTeacherName(t.getTeacherName());
            teacherWithCourse.setCourseID(t.getCourseID());
            teacherWithCourse.setTeacherAge(t.getTeacherAge());
            Course course=courseRepository.findById(t.getCourseID()).get();
            teacherWithCourse.setCourse(course);
            list.add(teacherWithCourse);
        }
        return list;
    }

    @Override
    public List<TeacherWithCourse> findAllByTeacherName(String teacherName) {
        List<TeacherWithCourse> lists=new ArrayList<>();
        List<Teacher>teacherLists=teacherRepository.findAllByTeacherName(teacherName);
        for (Teacher t:teacherLists){
            TeacherWithCourse teacherWithCourse=new TeacherWithCourse();
            teacherWithCourse.setId(t.getId());
            teacherWithCourse.setTeacherAge(t.getTeacherAge());
            teacherWithCourse.setTeacherName(t.getTeacherName());
            teacherWithCourse.setCourseID(t.getCourseID());
            Course course=courseRepository.findById(t.getCourseID()).get();
            teacherWithCourse.setCourse(course);
            lists.add(teacherWithCourse);
        }
        return lists;
    }

    @Override
    public void deletedById(String teacherId) {
        teacherRepository.deleteById(teacherId);
    }

    @Override
    public void insertOrUpdate(Teacher teacher) {
        if (teacher.getId()==null){
            String str = UUID.randomUUID().toString();
            teacher.setId(str);
        }
        if (teacher.getCourseID()==null)
            teacher.setCourseID("fa99db97-2eb4-4826-b5ed-88286ff833e6");
        teacherRepository.save(teacher);
    }
}
