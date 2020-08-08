package com.cg.demo.springjpa.student.assignment.service;

import java.util.List;

import com.cg.demo.springjpa.student.assignment.exception.InvalidDobException;
import com.cg.demo.springjpa.student.assignment.exception.StudentAlreadyExists;
import com.cg.demo.springjpa.student.assignment.exception.StudentNotFoundException;
import com.cg.demo.springjpa.student.assignment.model.Student;

public interface IStudentService {

	public Student addStudent(Student student) throws StudentAlreadyExists, InvalidDobException;
	public Student findStudent(int studentId) throws StudentNotFoundException;
	public Student updateStudent(Student student);
	public List<Student> getAllStudents();
	public void deleteStudent(int studentId) throws StudentNotFoundException;
	
	public Student findStudentByNameAndId(String studentName , int studentId);

	public Student findStudentByName(String studentName);
} 
