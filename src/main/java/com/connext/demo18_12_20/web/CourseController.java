package com.connext.demo18_12_20.web;

import com.connext.demo18_12_20.entity.Course;
import com.connext.demo18_12_20.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void insert(@RequestBody Course course){
        courseService.insertAndUpdate(course);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public void update(@RequestBody Course course){
        courseService.insertAndUpdate(course);
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Course> findAll(){
        return courseService.findAll();
    }

    @RequestMapping(value = "/findAllByName",method = RequestMethod.GET)
    public List<Course> findAllByName(String name){
        return courseService.findAllByCourseName(name);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public void delete(String id){
        courseService.deleteById(id);
    }

}
