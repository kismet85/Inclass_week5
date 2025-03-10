package org.example;

import org.example.dao.StudentDao;
import org.example.model.Student;
import org.example.model.TimeSpent;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

        StudentDao studentDao = new StudentDao();
        Student newStudent = new Student();
        newStudent.setName("John Doe");
        newStudent.setEmail("john@example.com");

        studentDao.addStudent(newStudent);
        System.out.println("Student added!");
        System.out.println(studentDao.findStudent(1L).toString());

        Student student = studentDao.findStudent(1L);

        student.setName("Ismet Ymeri");
        student.setEmail("Kismet1985@hotmail.fi");

        studentDao.updateStudent(student);

        System.out.println(studentDao.findStudent(1L).toString());

    }
}