package com.example.demo.controller;

import com.example.demo.members.Course;
import com.example.demo.members.Enrollment;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/main/courses")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(path = "/all")
    public List<Course> getAll(){
        return courseService.getAll();
    }

    @GetMapping(path = "/enrollment")
    public List<Enrollment> getCourseEnrollment() {
        return courseService.getEnrollment();
    }
}
