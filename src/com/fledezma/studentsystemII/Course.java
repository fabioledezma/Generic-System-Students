package com.fledezma.studentsystemII;

import com.fledezma.studentsystemI.ProgrammingStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {

    private String courseName;
    private String courseCategory;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName, String courseCategory) {
        this.courseName = courseName;
        this.courseCategory = courseCategory;
    }

    public void addStudent(Student student) {

        Objects.requireNonNull(student);

        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }


    public void printStudents() {
        System.out.println("Course Name: " + courseName);

        students.forEach(student ->
                System.out.println("- " + student.name()));
    }
}
