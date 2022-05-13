package com.albi.SpringBoot.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    //jbql can be commented
    @Query("SELECT s FROM Student s WHERE  s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

}
