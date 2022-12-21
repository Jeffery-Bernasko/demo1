package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
        Student peter =  new Student(

                    "Peter",
                    "peter@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,20),
                    21
            );

            Student jeffery =  new Student(
                    "Jeffery",
                    "jeffery@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,20),
                    22
            );

            Student bernasko =  new Student(

                    "Bernasko",
                    "bernasko@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,20),
                    23
            );

            repository.saveAll(
                    List.of(peter,jeffery,bernasko)
            );
        };
    }
}
