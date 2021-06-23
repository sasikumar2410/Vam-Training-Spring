package com.vm.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@GetMapping("/hello")
	public String sayHello(){
		return "Hello Sasi";
	}

}