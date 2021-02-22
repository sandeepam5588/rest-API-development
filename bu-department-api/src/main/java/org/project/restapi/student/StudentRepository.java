package org.project.restapi.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String>{

	public Student findByRegno(String regno);
	

}
