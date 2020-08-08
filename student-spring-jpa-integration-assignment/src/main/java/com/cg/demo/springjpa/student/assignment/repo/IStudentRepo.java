package com.cg.demo.springjpa.student.assignment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.demo.springjpa.student.assignment.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer>{

	public Student findByStudentName(String studentName);
	public Student findByStudentNameAndStudentId(String studentName , int studentId);

}
