package org.project.restapi.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {  
	
	@GetMapping("/api/v1/bu/hello")
	public String sayHi(@RequestParam(value="name") String name) {
		return "hello "+ name;
		
	}

}