package com.fledezma.studentsystemII;

public class Main {

    public static void main(String[] args) {


        Course curso1 = new Course("Java", "Sistemas");
        Course curso2 = new Course("Matematicas", "Contabilidad");

        Student s1 = new Student("Fabio", "fabio@gmail.com");
        Student s2 = new Student("Juan", "juan@gmail.com");

        curso1.addStudent(s1);
        curso2.addStudent(s2);

        curso1.printStudents();
        curso2.printStudents();



    }
}
