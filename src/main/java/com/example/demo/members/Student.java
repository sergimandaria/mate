package com.example.demo.members;

public class Student {

    private long studId;

    private String name;

    private long semester;
    public Student() {
    }

    public Student(long studId, String name, long semester) {
        this.studId = studId;
        this.name = name;
        this.semester = semester;
    }


    public long getStudId() {
        return studId;
    }

    public void setStudId(long studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSemester() {
        return semester;
    }

    public void setSemester(long semester) {
        this.semester = semester;
    }
}
