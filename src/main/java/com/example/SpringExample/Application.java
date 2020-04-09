package com.example.SpringExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

        System.out.println("Read student by id:");
        Student student = studentDao.readById(1);
        System.out.println(student);

        studentDao.update(new Student(2, "Pavlo", 33));
        studentDao.delete(3);

        System.out.println("All students after CRUD:");
        studentDao.readAll().forEach(System.out::println);


    }
}
