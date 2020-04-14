package com.example.SpringExample.SpringCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        StudentDao studentDao = (StudentDao) run.getBean("getStudentDao");

        System.out.println("All students:");
        studentDao.create(new Student(1, "Nazar", 20));
        studentDao.create(new Student(2, "Olha", 23));
        studentDao.create(new Student(3, "Slava", 28));
        studentDao.readAll().forEach(System.out::println);

        System.out.println();
        System.out.println("After update:");
        studentDao.update(2, new Student(2, "Pavlo", 33));
        studentDao.readAll().forEach(System.out::println);

        studentDao.delete(2);
        System.out.println("After delete:");
        studentDao.readAll().forEach(System.out::println);

        System.out.println();
        System.out.println("Read user by id:");
        Optional<Student> student = studentDao.readById(4);
        System.out.println(student);

        System.out.println();
        System.out.println("All students after CRUD:");
        studentDao.readAll().forEach(System.out::println);


    }
}
