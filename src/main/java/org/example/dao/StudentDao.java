package org.example.dao;
import org.example.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class StudentDao {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    public Student findStudent(Long id){
        EntityManager em = emf.createEntityManager();
        Student student = em.find(Student.class, id);
        em.close();
        return student;
    }

    public void addStudent(Student student){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }


    public void updateStudent(Student student){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
        em.close();
    }
}
