package com.vickysingh.dasboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
