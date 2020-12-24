package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {

	public Student addStudent(Student student);
	
	public List<Student> listStudents();
	
	public Student updateStudent(long id, Student student);
	
	public boolean removeStudent(Student student);

	
		
}
