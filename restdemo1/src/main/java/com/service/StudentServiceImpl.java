package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentSevice {

	@Autowired
	private StudentDao studentDao;

	@Override
	public Student addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	public List<Student> listStudents() {
		return studentDao.listStudents();
	}

	@Override
	public Student updateStudent(long id , Student student) {
		return studentDao.updateStudent(id , student);
	}

	@Override
	public boolean removeStudent(Student student) {
		return studentDao.removeStudent(student);
	}
	

}
