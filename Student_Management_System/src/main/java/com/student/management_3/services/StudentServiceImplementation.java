package com.student.management_3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management_3.entities.Student;
import com.student.management_3.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {

	@Autowired
	StudentRepository repo;
 
	@Override
	//adding data
	public String addStudent(Student st) {
		repo.save(st);
		return "student added";
	}
 
    //searching a int roll key&value
	public Student searchStudent(String roll) {
		return repo.findById(roll).get();
		
	}
	
	//updating 
	public String updateStudent(Student st) {
		repo.save(st);
		return "student updated";
	}
	
	//deleting the int roll number
	public String deleteStudent(String roll) {
		repo.deleteById(roll);
		return "student deleted";
	}
	
	
	//fetching the data
	public List<Student> fetchAllStudent(){
		return repo.findAll();
	}
	
	
	public String deleteAllStudent() {
		repo.deleteAll();
		return"All students deleted!";
	}

	

	@Override
	public String deleteStudent(int roll) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student searchStudent(int roll) {
		// TODO Auto-generated method stub
		return null;
	}

}















