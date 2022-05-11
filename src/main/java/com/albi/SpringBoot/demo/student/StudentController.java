package com.albi.SpringBoot.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {


    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/student")
    public Optional<Student> getStudent() {
        return studentService.getStudent(1L);
    }
    @GetMapping(path = "/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
