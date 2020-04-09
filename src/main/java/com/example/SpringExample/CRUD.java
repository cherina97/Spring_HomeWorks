package com.example.SpringExample;

import java.util.List;

public interface CRUD {

    Student create(Student student);

    Student readById(int id);

    List <Student> readAll ();

    Student update(Student student);

    void delete(int id);


}
