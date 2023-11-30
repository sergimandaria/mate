package com.example.demo.members;

public class Course {
    private long courseId;

    private String title;

    private long contactHours;

    private long profId;



    public Course(long courseId, String title, long contactHours, long profId) {
        this.courseId = courseId;
        this.title = title;
        this.contactHours = contactHours;
        this.profId = profId;
    }

    public Course() {
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getContactHours() {
        return contactHours;
    }

    public void setContactHours(long contactHours) {
        this.contactHours = contactHours;
    }

    public long getProfId() {
        return profId;
    }

    public void setProfId(long profId) {
        this.profId = profId;
    }
}
