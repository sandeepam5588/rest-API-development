package org.project.restapi.hello;

import org.project.restapi.apiexceptions.ApiRequestException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {  
	
	@GetMapping("/api/v1/bu/hello")
	public ResponseEntity<String> sayHi(@RequestParam(value="name") String name) {
		throw new ApiRequestException("sandeep created exception");
	}

}