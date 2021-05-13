package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao stdao;
	public Student createStudent(Student student) {
		return stdao.save(student);
	}
	public Optional<Student> getById(Integer id) {
		return stdao.findById(id);
	}
	public Iterable<Student> getAll() {
		return stdao.findAll();
	}
}
