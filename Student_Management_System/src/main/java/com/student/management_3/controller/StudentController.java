package com.student.management_3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.management_3.entities.Student;
import com.student.management_3.services.StudentService;

//@RestController
//public class StudentController {

//exmaple
//	@GetMapping("/hello")
//	public String sayHello() {
//		return "Hello from spring boot!";
//	}
//	
//	@GetMapping("/bye")
//	public String sayBye() {
//		return "Bye from spring boot!";
//	}
//	
//	@GetMapping("/data/{data}")
//	public String acceptData(@PathVariable String data) {
//		return "Data received:" + data;
//	}
//	
//	@GetMapping("/data2")
//	public String acceptValues(@RequestParam String d1,
//			@RequestParam String d2) {
//		return "Data received:" + d1 + " " + d2;
//	}

//real program
//  //creating data in postman
//	@GetMapping("/acceptStudent")
//	public String acceptStudent(
//			@RequestParam int roll,
//			@RequestParam String name,
//			@RequestParam String branch,
//			@RequestParam int yop, 
//			@RequestParam double cgpa) {
//		Student st = new Student(roll, name, branch, yop, cgpa);
//		System.out.println(st);
//		return "Student Data received";
//	}

//	@PostMapping("/acceptStudentObject")
//	public String acceptStudentObject(@RequestBody Student st) {
//		System.out.println(st);
//		return "Student Data received";
//	}
//
//	@Autowired
//	StudentService service;
//
//	// adding keys & values in row
//	@PostMapping("/addStudent")
//	public String addStudent(@RequestBody Student st) { 
//
//		service.addStudent(st);
//		return "Student added successfully";
//	}

//	 //searching the INT roll value
//	@GetMapping("/searchStudent")
//	public Student searchStudent(@RequestParam int roll) {
//		return service.searchStudent(roll);
//	}
//
//	// updating the data	
//	@PutMapping("/updateStudent")
//	public String updateStudent(@RequestBody Student st){
//		service.addStudent(st);
//		return "Student updated successfully";
//	}
//
//	// deleting the data
//	@DeleteMapping("/deleteStudent")
//	public String deleteStudent(@RequestParam INT roll) {
//		service.deleteStudent(roll);
//		return "Student delete successfully";
//	}
//
//	// fetching data
//	@GetMapping("/fetchAllStudent")
//	public List<Student> fetchAllStudent() {
//		return service.fetchAllStudent();
//	}
//	
//
//	@DeleteMapping("/deleteAllStudent")
//	public String deleteAllStudent() {
//		service.deleteAllStudent();
//		return"All student deleted!";
//	}
//
//}

//using HTML

@Controller
public class StudentController {

    @Autowired
    StudentService service;

    // ADD STUDENT
    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute Student st) {
        service.addStudent(st);
        return "redirect:/";
    }

    // SEARCH STUDENT
    @GetMapping("/searchStudent")
    public String searchStudent(@RequestParam String roll, Model model) {
        Student st = service.searchStudent(roll);
        model.addAttribute("student", st);
        return "displayStudent";
    }

    // UPDATE STUDENT
    @PostMapping("/updateStudent")
    public String updateStudent(@ModelAttribute Student st) {
        service.addStudent(st);
        return "redirect:/";
    }

    // DELETE STUDENT
    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam String roll) {
        service.deleteStudent(roll);
        return "redirect:/";
    }

    // FETCH ALL STUDENTS
    @GetMapping("/fetchAllStudent")
    public String fetchAllStudent(Model model) {
        List<Student> stList = service.fetchAllStudent();
        model.addAttribute("studentList", stList);
        return "displayAllStudent";
    }

    // DELETE ALL STUDENTS
    @GetMapping("/deleteAllStudent")
    public String deleteAllStudent() {
        service.deleteAllStudent();
        return "redirect:/";
    }
}
