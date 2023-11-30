package com.example.demo.members;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enrollment {
    private String studName;

    private long studId;

    private String courseName;

    private long studSemester;


    public Enrollment(String courseName, String studName, long studId, long studSemester) {
        this.studName = studName;
        this.studId = studId;
        this.courseName = courseName;
        this.studSemester = studSemester;
    }

    public Enrollment() {
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public long getStudId() {
        return studId;
    }

    public void setStudId(long studId) {
        this.studId = studId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public long getStudSemester() {
        return studSemester;
    }

    public void setStudSemester(long studSemester) {
        this.studSemester = studSemester;
    }
}
