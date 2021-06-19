package com.vm.training.java.rest.studentServer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vm.training.java.rest.student.Student;
@Service
public class StudentService
{
 List<Student> students;
 public List<Student> creatStudents()
 {
	students=new ArrayList<Student>();
	students.add(new Student(5733,"Sasi Kumar", 8, 81));
	students.add(new Student(5728,"Shashank", 8, 82));
	students.add(new Student(5788, "rockt", 8, 65));
	students.add(new Student(5745,"Nikhil", 8, 93));
	return students;
	 
 }
 public List<Student> getStudents(){
	 creatStudents();
	 return students;
 }
public Student getStudentById(int id) {
	
	return students.stream().filter(s->s.getId()==id).findFirst().get();
}
}
