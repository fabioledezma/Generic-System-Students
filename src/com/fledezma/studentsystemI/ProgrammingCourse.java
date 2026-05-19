package com.fledezma.studentsystemI;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProgrammingCourse {

    private String courseName;
    private String instructorName;
    private List<ProgrammingStudent> students = new ArrayList<>();

    public ProgrammingCourse(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public void addStudent(ProgrammingStudent student) {

        Objects.requireNonNull(student);

        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public boolean removeStudent(ProgrammingStudent student) {
        return students.remove(student);
    }

    private List<ProgrammingStudent> getStudents() {
        return students;
    }

    public void printStudents() {
        System.out.println(getStudents());
    }
}
