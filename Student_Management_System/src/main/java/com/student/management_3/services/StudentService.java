package com.student.management_3.services;

import java.util.List;

import com.student.management_3.entities.Student;

public interface StudentService {

	//adding data
	String addStudent(Student st);

	// searching roll number in get
	Student searchStudent(String roll);

	// update student
	String updateStudent(Student st);

	// delete String roll number
	String deleteStudent(String roll);
	
	
	
	//fetching data
	List<Student> fetchAllStudent();
	String deleteAllStudent();

	String deleteStudent(int roll); 

}
