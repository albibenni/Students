package com.albi.SpringBoot.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/newStudent")
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable ("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "/updateStudent/{studentId}")
    public void updateStudent (
            @PathVariable ("studentId") Long studentId,
            @RequestBody (required = false) String email,
            @RequestBody (required = false) String name){
        studentService.updateStudent(studentId, email, name);
    }
}
