package com.topekox.example.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student ucup = new Student(
                    "Ucup Topekox",
                    "ucup@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 23)
            );

            Student budi = new Student(
                    "Budi Sudarsono",
                    "budi@gmail.com",
                    LocalDate.of(2001, Month.OCTOBER, 2)
            );

            studentRepository.saveAll(List.of(ucup, budi));
        };

    }
}
