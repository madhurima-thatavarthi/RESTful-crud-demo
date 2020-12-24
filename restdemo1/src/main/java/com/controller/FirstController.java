package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentSevice;

@RestController
public class FirstController {

	@Autowired
	private StudentSevice studentService;

	@PostMapping(value = "/add")

	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@PutMapping(value = "/update/{id}")

	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}

	@DeleteMapping(value = "/delete")
	public boolean removeStudent(@RequestBody Student student) {
		return studentService.removeStudent(student);
	}
	
	@GetMapping(value="/read")
	public Student listStudent() {
		return (Student) studentService.listStudents();
	}
}
