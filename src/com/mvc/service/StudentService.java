package com.mvc.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.mvc.entity.Student;
public class StudentService {
	
	private List<Student> students;
	
	public StudentService() {
		students = new ArrayList<>();
		students.add(new Student(1, "Vardenis","Pavardenis"));
		students.add(new Student(2, "RTardenis","RTavardenis"));
		
	}
    public Optional<Student> getStudent(int id) {
      for(int i = 0; i<= students.size(); i++) {
    	  
      }
	return null;
    }
}