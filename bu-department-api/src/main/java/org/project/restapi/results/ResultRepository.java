package org.project.restapi.results;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ResultRepository extends CrudRepository<Result, String>{

	@Query("FROM Result r WHERE r.regno = :regno AND r.semester = :sem")
    List<Result> findByRegnoAndSemester(@Param("regno") String regno, @Param("sem") String sem);

}
