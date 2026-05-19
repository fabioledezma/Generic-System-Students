package com.fledezma.studentsystemI;

public class Main {

    public static void main(String[] args) {

        //Un sistema donde se le exige solo crear un curso en especifico, y unos estudiantes especificos.
        //Pensado para un caso en especifico...No para escalar...

        ProgrammingCourse javaCourse = new ProgrammingCourse("Java","Fabio Ledezma");

        ProgrammingStudent s1 = new ProgrammingStudent("Juan Camilo", "juan@gmail.com");
        ProgrammingStudent s2 = new ProgrammingStudent("Keiner Pacheco", "keiner@gmail.com");
        ProgrammingStudent s3 = new ProgrammingStudent("Luis Romero", "luisromero@gmail.com");

        javaCourse.addStudent(s1);
        javaCourse.addStudent(s2);
        javaCourse.addStudent(s3);

        //javaCourse.removeStudent(s1);


        javaCourse.printStudents();

    }
}
