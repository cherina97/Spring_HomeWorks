package com.example.SpringExample.SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        UniversityService universityService = (UniversityService) run.getBean("universityService");

        List<University> universities = new ArrayList<>();
        universities.add(new University("Uni1", 1, 10, 500, "Address1"));
        universities.add(new University("Uni2", 2, 15, 2100, "Address2"));
        universities.add(new University("Uni3", 3, 18, 5000, "Address3"));
        universities.add(new University("Uni4", 1, 5, 1000, "Address4"));
        universities.add(new University("Uni5", 2, 21, 2500, "Address5"));
        universityService.saveAll(universities);

        System.out.println("Read all:");
        universityService.readAll().forEach(System.out::println);

        System.out.println();
        System.out.println("Read by id:");
        System.out.println(universityService.readById(2));

        System.out.println();
        System.out.println("Read by name:");
        System.out.println(universityService.readByName("Uni4"));

        System.out.println();
        System.out.println("Delete:");
        universityService.deleteById(4);
        universityService.readAll().forEach(System.out::println);

        System.out.println();
        System.out.println("Read by id:");
        System.out.println(universityService.readById(5));

        System.out.println();
        System.out.println("Update:");
        universityService.updateName(5, "updated");
        universityService.readAll().forEach(System.out::println);







    }
}
