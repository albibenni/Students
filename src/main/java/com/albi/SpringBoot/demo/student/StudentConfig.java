package com.albi.SpringBoot.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    @Autowired
    CommandLineRunner commandLineRunner (StudentRepository studentRepository) {
        return args -> {
            Student alberto = new Student(
                    1L,
                    "Alberto",
                    "albi.benni@mail.com",
                    LocalDate.of(1992, Month.JULY, 15)
            );

            Student carlo = new Student(
                    "Carlo",
                    "carlo.c@mail.com",
                    LocalDate.of(1999, Month.JULY, 1)
            );

            studentRepository.saveAll(List.of(alberto, carlo));
        };
    }
}
