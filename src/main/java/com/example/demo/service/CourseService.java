package com.example.demo.service;


import com.example.demo.DAO.CourseRepository;
import com.example.demo.members.Course;
import com.example.demo.members.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAll(){
        return courseRepository.getAll();
    }

    public List<Enrollment> getEnrollment(){
        return courseRepository.getEnrollment();
    }
}
