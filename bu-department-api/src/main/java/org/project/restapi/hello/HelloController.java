package org.project.restapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/api/v1/bu/hello")
	public String sayHi() {
		return "Hi..!";
	}

}