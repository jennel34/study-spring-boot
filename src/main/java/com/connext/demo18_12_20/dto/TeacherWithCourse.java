package com.connext.demo18_12_20.dto;

import com.connext.demo18_12_20.entity.Course;

public class TeacherWithCourse {
    private String id;
    private String teacherName;
    private int teacherAge;
    private String courseID;
    private Course course;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(int teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "TeacherWithCourse{" +
                "id='" + id + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherAge=" + teacherAge +
                ", courseID='" + courseID + '\'' +
                ", course=" + course +
                '}';
    }
}
