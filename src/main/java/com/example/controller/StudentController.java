package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}

	@GetMapping("/displayall")
	public Iterable<Student> getAll() {
		return service.getAll();
	}
}
