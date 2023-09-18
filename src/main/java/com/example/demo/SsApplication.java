package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SsApplication {

	
	@GetMapping
	public String helloWorld()
	{
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(SsApplication.class, args);
	}

}
