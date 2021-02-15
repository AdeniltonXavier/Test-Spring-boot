package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class TestController {
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	@ResponseBody
	public String testParam(@RequestParam(value = "id") String id) {
		
		Integer parseValue = 0;
		
		try {
			
			parseValue = Integer.parseInt(id);
			
			if(parseValue % 2 == 0) {
				return String.format("O número %s é par", parseValue);
			}else {
				
				return String.format("O número %s é ímpar", parseValue);
			}
			
		}catch(NumberFormatException ex) {
			
			return "Número inválido";
		}
		
	}
}
