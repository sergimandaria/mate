package com.example.demo.controller;

import com.example.demo.members.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/main/courses/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getAll();
    }

// TODO
//    @PutMapping
//    public void changeGrade(@RequestBody char grade, long studentId){
//        studentService.changeGrade(grade, studentId);
//    }

}
