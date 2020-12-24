package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@NamedQuery(name = "listStudents", query = "from Student")

@Component("student")
@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int studentNo;
	@Column(name = "NAME")
	private String studentName;
	@Column(name = "MARKS")
	private float marks;

	public Student() {
		super();
	}

	public Student(int studentNo, String studentName, float marks) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

}
