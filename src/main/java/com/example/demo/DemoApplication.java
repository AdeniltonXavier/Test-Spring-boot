package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/*@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public String testParam() {
		return "Nothing";
	}*/

	/*@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "") String name) {
		
		return String.format("Hello %s!", name);
	}*/
}