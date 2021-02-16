package org.project.restapi.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/api/v1/bu/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping("/api/v1/bu/students/{id}")
	public Optional<Student> getStudent(@PathVariable String id) {
		return studentService.getStudent(id);
	}
	
	@RequestMapping(method= RequestMethod.POST, value = "/api/v1/bu/students")
	public String addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/api/v1/bu/students/{regno}")
	public String updateStudent(@RequestBody Student student, @PathVariable String regno) {
		return studentService.updateStudent(regno, student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/v1/bu/students/{regno}")
	public String deleteStudent(@PathVariable String regno) {
		return studentService.deleteStudent(regno);
	}
	

}
