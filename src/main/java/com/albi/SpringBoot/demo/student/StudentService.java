package com.albi.SpringBoot.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Optional<Student> getStudent(Long id) {
        return studentRepository.findById(id);
    }
    @GetMapping(path = "/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
