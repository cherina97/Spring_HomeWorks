package com.example.SpringExample.SpringCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StudentDao implements CRUD {
    List<Student> students = new ArrayList<>();

    @Override
    public Student create(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Optional<Student> readById(int id) {
        return students.stream()
                .filter(item -> Objects.equals(item.getId(), id))
                .findFirst();
    }

    @Override
    public List<Student> readAll() {
        return students;
    }

    @Override
    public void update(int id, Student student) {
        delete(id);
        students.add(student);
    }

    @Override
    public void delete(int id) {
        Optional<Student> readById = readById(id);
        readById.ifPresent(o -> students.remove(o));
    }
}
