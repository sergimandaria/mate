package com.example.demo.service;


import com.example.demo.DAO.StudentRepository;
import com.example.demo.members.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student getUserByUsername(String username) {
        return studentRepository.findByUsername(username);
    }

    public List<Student> getAll(){
        return studentRepository.getAll();
    }

//TODO
//    public void changeGrade(char grade, long studentName){
//        studentRepository.changeGrade(grade, studentName);
//    }
}
