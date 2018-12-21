package com.connext.demo18_12_20.web;

import com.connext.demo18_12_20.dto.TeacherWithCourse;
import com.connext.demo18_12_20.entity.Teacher;
import com.connext.demo18_12_20.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherService;
    //展示全部
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<TeacherWithCourse> list(){
        return teacherService.findAll();
    }
    //根据名字查找出所有的符合条件的记录
    @RequestMapping(value = "/findAllByName",method = RequestMethod.GET)
    public List<TeacherWithCourse> findAllByName(String name){
        return teacherService.findAllByTeacherName(name);
    }
    //保存添加的或者修改的数据
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@RequestBody Teacher teacher){
        teacherService.insertOrUpdate(teacher);
        return "success";
    }
    //根据id删除记录
    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public String deleteById(String id){
        teacherService.deletedById(id);
        return "success";
    }
}
