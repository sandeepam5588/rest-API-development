package org.project.restapi.results;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bu")
public class ResultController {
	@Autowired
	private ResultService resultService;
	
	@GetMapping("/results/mca/{regno}")
	public List<Result> getResult(@PathVariable String regno, @RequestParam(value = "sem") String sem) {
		return resultService.getResult(regno, sem);
	}
	@PostMapping("/results/mca")
	public String addResult(@RequestBody Result result) {
		return resultService.addResult(result);
	}
	@PutMapping("/results/mca/{regno}")
	public String updateResult(@RequestBody Result result) {
		return resultService.updateResult(result);
	}

}
