package com.example.demo.DAO;

import com.example.demo.members.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository{

    private final String GET_STUDENT_BY_NAME = "SELECT * FROM student WHERE name = ?";
    private final String GET_ALL_STUDENTS = "SELECT * FROM student";

    private final String CHANGE_STUDENT_GRADE = "UPDATE student SET ";


    private JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Student findByUsername(String username) {
        return jdbcTemplate.queryForObject(GET_STUDENT_BY_NAME, new Object[]{username}, (rs, rowNum) -> {
            Student stud = new Student();
            stud.setStudId(rs.getLong("studId"));
            stud.setName(rs.getString("name"));
            stud.setSemester(rs.getLong("semester"));
            return stud;
        });
    }

    public List<Student> getAll(){
        return jdbcTemplate.query(GET_ALL_STUDENTS, (rs, rowNum) -> {
            Student stud = new Student();
            stud.setStudId(rs.getLong("studId"));
            stud.setName(rs.getString("name"));
            stud.setSemester(rs.getLong("semester"));
            return stud;
        });
    }


// TODO
//    public void changeGrade(char grade, String studentName){
//
//    }

}
