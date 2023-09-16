package com.mh.test.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    StudentRepository repository;
    @Autowired
    StudentConfig(StudentRepository studentRepository){
        this.repository = studentRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            repository.save(new Student(1L,"Ally",10, "aaa@gmail.com"));
            repository.save(new Student(2L,"Tailer",20, "tailer@gmail.com"));
        };
    }
}
