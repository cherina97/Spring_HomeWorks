package com.example.SpringExample;

import java.util.ArrayList;
import java.util.List;

public class StudentDao implements CRUD {
    List<Student> students = new ArrayList<>();

    @Override
    public Student create(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student readById(int id) {
        return students.get(id - 1);
    }

    @Override
    public List<Student> readAll() {
        return students;
    }

    @Override
    public Student update(Student student) {
        return students.set(student.getId() - 1, student);
    }

    @Override
    public void delete(int id) {
        students.remove(id - 1);
    }
}
