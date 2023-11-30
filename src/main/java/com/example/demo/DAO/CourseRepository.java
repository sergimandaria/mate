package com.example.demo.DAO;

import com.example.demo.members.Course;
import com.example.demo.members.Enrollment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseRepository {
    private final String GET_ALL_COURSE = "SELECT * FROM course";

    private final String GET_ENROLLMENT = "SELECT c.title, s.* FROM course c INNER JOIN enrollment e ON c.courseId = e.courseId INNER JOIN student s ON s.studId = e.studId";

    private final JdbcTemplate jdbcTemplate;

    public CourseRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Course> getAll(){
        return jdbcTemplate.query(GET_ALL_COURSE, (rs, rowNum) -> {
            Course course = new Course();
            course.setCourseId(rs.getLong("courseId"));
            course.setContactHours(rs.getLong("contactHours"));
            course.setTitle(rs.getString("title"));
            course.setProfId(rs.getLong("profId"));
            return course;
        });
    }

    public List<Enrollment> getEnrollment() {
        return jdbcTemplate.query(GET_ENROLLMENT, (rs, numRows) ->{
            return new Enrollment(rs.getString("title"), rs.getString("name"), rs.getLong("studId"), rs.getLong("semester"));
        });
    }

}
