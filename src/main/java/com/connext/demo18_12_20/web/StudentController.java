package com.connext.demo18_12_20.web;

import com.connext.demo18_12_20.dto.StudentWithCourse;
import com.connext.demo18_12_20.entity.Course;
import com.connext.demo18_12_20.entity.Student;
import com.connext.demo18_12_20.service.CourseService;
import com.connext.demo18_12_20.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/index")
    public String student(){
        return "student";
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ResponseBody
    public List<StudentWithCourse> findAll(){
        return findCourseById(studentService.findAll());
    }

    @RequestMapping(value = "/findAllByName",method = RequestMethod.GET)
    @ResponseBody
    public List<StudentWithCourse> findAllByName(String name){
        return findCourseById(studentService.findAllByStudentName(name));
    }

    public List<StudentWithCourse> findCourseById(List<Student> students){
        List<StudentWithCourse> list = new ArrayList<>();
        for (Student s:students) {
            Course c = courseService.findById(s.getCourseID());
            StudentWithCourse swc = new StudentWithCourse();
            swc.setId(s.getId());swc.setStudentName(s.getStudentName());swc.setStudentAge(s.getStudentAge());swc.setCourse(c);
            list.add(swc);
        }
        return list;
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public String insert(@RequestBody Student student){
        studentService.insertAndUpdate(student);
        return "success";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public String delete(String id){
        studentService.deleteById(id);
        return "success";
    }
}
