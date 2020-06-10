package com.javaxp.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public String message() {
		return restTemplate.getForEntity("http://ribbon-service", String.class).getBody();
	}

}
