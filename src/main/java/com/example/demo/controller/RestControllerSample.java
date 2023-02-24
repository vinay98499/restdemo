package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestControllerSample {

	@GetMapping("/sampleget")	
	public String getSampleData(){
	
		RestTemplate restObj=new RestTemplate();
		ResponseEntity<String> response = restObj.getForEntity("https://cat-fact.herokuapp.com/facts/", String.class);
		return response.getBody();
	}
	
}
