package com.albi.SpringBoot.demo.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void itShouldCheckIfStudentExistsEmail(){
//        given
        String email = "albi@gmail.com";
        Student student = new Student(
                "Albert",
                email,
                LocalDate.of(1993,10,15)
        );
        studentRepository.save(student);

//when
        Optional<Student> isPresent = studentRepository.findStudentByEmail(email);
//then
        assertThat(isPresent).isPresent();
    }
}