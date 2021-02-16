package org.project.restapi.department;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
    public List<Department> getAllDepartments() {
    	List<Department> depts = new ArrayList<>();
    	departmentRepository.findAll().forEach(depts::add);
    	return depts;
    }

	public Optional<Department> getDepartment(String id) {
		return departmentRepository.findById(id);
	}

	public String addDepartment(Department dept) {
		departmentRepository.save(dept);
		return "record added successfully";
	}

	public String updateDepartment(String id, Department dept) {
		departmentRepository.save(dept);
		return "record updated successfully";
	}

	public String deleteDepartment(String id) {
		try {
		departmentRepository.deleteById(id);
		}catch(EmptyResultDataAccessException | InvalidDataAccessApiUsageException ex) {
			return "record does not exist..!";
		}
		return "record deleted successfully";
	}
	
	
}
