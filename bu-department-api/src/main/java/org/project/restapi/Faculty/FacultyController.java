package org.project.restapi.Faculty;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyController {
	
	@Autowired
	private FacultyService facultyService;
	
	@RequestMapping("/api/v1/bu/faculty")
	public List<Faculty> getAllFaculty() {
		return facultyService.getAllFaculty();
	}
	
	@RequestMapping("/api/v1/bu/faculty/{id}")
	public Optional<Faculty> getFaculty(@PathVariable String id) {
		return facultyService.getFaculty(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value= "/api/v1/bu/faculty")
	public String addFaculty(@RequestBody Faculty faculty) {
		return facultyService.addFaculty(faculty);
	}
	@RequestMapping(method = RequestMethod.PUT, value="/api/v1/bu/faculty/{id}")
	public String updateFaculty(@RequestBody Faculty faculty, @PathVariable String id) {
		return facultyService.updateFaculty(faculty, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/api/v1/bu/faculty/{id}")
	public String deleteFaculty(@PathVariable String id) {
		return facultyService.deleteFaculty(id);
	}

}
