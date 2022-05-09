package com.albi.SpringBoot.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public Student getStudent() {
        return
                new Student(
                        1L,
                        "Alberto",
                        "email@gmail.com",
                        LocalDate.of(1992, 7, 15),
                        21
                );
    }
    @GetMapping(path = "/students")
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Alberto",
                        "email@gmail.com",
                        LocalDate.of(1992, 7, 15),
                        21
                )
        );
    }
}
