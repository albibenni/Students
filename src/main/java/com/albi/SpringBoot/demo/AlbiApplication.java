package com.albi.SpringBoot.demo;

import com.albi.SpringBoot.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class AlbiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbiApplication.class, args);
	}



}