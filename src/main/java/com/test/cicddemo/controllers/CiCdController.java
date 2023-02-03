package com.test.cicddemo.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCdController {
	
	@GetMapping("/api/test")                                                                       
	public String greetings() {                           
		return "Happy CI/CD testing with local time : " + LocalDateTime.now() + "\n";  
	}       

}
