package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Transactional
@Repository("studentDao")
public  class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Student addStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(student);
		return student;
	}

	@Override
	public List<Student> listStudents() {
		Session session = sessionFactory.getCurrentSession();
		List<Student> students = session.createNamedQuery("listStudents").getResultList();
		return students;
	}

	@Override
	public Student updateStudent(long id , Student student) {
		Session session = sessionFactory.getCurrentSession();
		Student student1=session.byId(Student.class).load(id);
		student1.setStudentName(student.getStudentName());
		student1.setMarks(student.getMarks());
		session.update(student1);    
	    return student1;
	}

	@Override
	public boolean removeStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.get(Student.class, student.getStudentNo());
		session.remove(student);
		return true;
	}

}
