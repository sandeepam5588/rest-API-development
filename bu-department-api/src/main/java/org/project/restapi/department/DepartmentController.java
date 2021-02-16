package org.project.restapi.department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/api/v1/bu/departments")
	public List<Department> getDepartments() {
		return departmentService.getAllDepartments();
	}
	
	@RequestMapping("/api/v1/bu/departments/{id}")
	public Optional<Department> getDepartment(@PathVariable String id) {
		return departmentService.getDepartment(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/bu/departments")
	public String addDepartment(@RequestBody Department dept) {
		return departmentService.addDepartment(dept);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/api/v1/bu/departments/{id}")
	public String updateDepartment(@RequestBody Department dept, @PathVariable String id) {
		return departmentService.updateDepartment(id, dept);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/v1/bu/departments/{id}")
	public String deleteDepartment(String id) {
		return departmentService.deleteDepartment(id);
	}

}
