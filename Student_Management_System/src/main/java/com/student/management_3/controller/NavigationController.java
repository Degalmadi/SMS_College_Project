package com.student.management_3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class NavigationController {

	// inserting the data
	@GetMapping("/openAddStudentPage")
	public String openAddStudentPage() {
		return "addStudent";
	}

	// updating the data
	@GetMapping("/openUpdateStudentPage")
	public String openUpdateStudentPage() {
		return "updateStudent";
	}

	// deleting the student
	@GetMapping("/openDeleteStudentPage")
	public String openDeleteStudentPage() {
		return "deleteStudent";
	}
	
	// searching the student
	@GetMapping("/openSearchStudentPage")
	public String openSearchStudentPage() {
		return "searchStudent";
	}

}
