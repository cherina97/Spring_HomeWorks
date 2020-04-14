package com.example.SpringExample.SpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentDaoConfiguration {

    @Bean
    public StudentDao getStudentDao(){
        return new StudentDao();
    }
}
