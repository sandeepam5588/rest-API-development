package org.project.restapi.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {  
	
	@RequestMapping("/api/v1/bu/hello")
	@ResponseBody
	public ResponseEntity sayHi() {
		return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);	}

}