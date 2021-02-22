package org.project.restapi.courses;


import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{

	public ArrayList<Course> findByDepartment(String departmentName);

}
