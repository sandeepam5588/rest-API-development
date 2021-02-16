package org.project.restapi.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public String addStudent(Student student) {
		try {
		studentRepository.save(student);
		} catch(DataIntegrityViolationException ex) {
			return "Duplicate Key..!" + student.getRegno() + " Regno already exists";
		}
		return "recored added successfully";
	}
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	public Optional<Student> getStudent(String regno) {
		return studentRepository.findById(regno);
	}
	public String updateStudent(String regno, Student student) {
		studentRepository.save(student);
		return "record updated successfully";
	}
	public String deleteStudent(String regno) {
		try {
		studentRepository.deleteById(regno);
		} catch(EmptyResultDataAccessException ex) {
			return "student record with the regno "+ regno + " does not exist..!";
		}
		return "record deleted successfully";
	}

	
}
