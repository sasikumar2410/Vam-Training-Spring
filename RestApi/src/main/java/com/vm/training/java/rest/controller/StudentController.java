package com.vm.training.java.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vm.training.java.rest.student.Student;
import com.vm.training.java.rest.studentServer.StudentService;

@RestController
public class StudentController
{
	@Autowired
	StudentService studentService;
	@RequestMapping("/students")
	List<Student> getStudents() {
		return studentService.creatStudents();
	}
	@RequestMapping("students/{id}")
	Student getStudentById(@PathVariable("id") int id)
	{
		return studentService.getStudentById(id);
		
	}
	
}
