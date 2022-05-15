package com.albi.SpringBoot.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
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

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());

        if (studentOptional.isPresent()){
            throw new IllegalStateException("Email taken");
        }

        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        if(!studentRepository.existsById(studentId))
            throw new IllegalStateException("Student with id "+ studentId+ " does not exist");

        studentRepository.deleteById(studentId);

    }

    @Transactional
    public void updateStudent(Student student){

    }
}
