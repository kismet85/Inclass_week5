package org.example.model;
import javax.persistence.*;

import java.util.List;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "student", cascade = CascadeType.PERSIST)
    private List<TimeSpent> timeSpentList;

    public Student(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<TimeSpent> getTimeSpentList() {
        return timeSpentList;
    }

    public void setTimeSpentList(List<TimeSpent> timeSpentList) {
        this.timeSpentList = timeSpentList;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}
