package com.example.SpringExample.SpringCore;

import java.util.List;
import java.util.Optional;

public interface CRUD {

    Student create(Student student);

    Optional<Student> readById(int id);

    List <Student> readAll ();

    void update(int id, Student student);

    void delete(int id);


}
