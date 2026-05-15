package com.example.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestCICDController {

	@GetMapping
	public ResponseEntity<String> test() {

		return ResponseEntity.ok("spring app is deployed on azure using azuredevops successfully!");
	}

}
