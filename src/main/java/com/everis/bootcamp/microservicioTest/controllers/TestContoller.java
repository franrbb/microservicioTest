package com.everis.bootcamp.microservicioTest.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {
	
	@Value("${some.value}")
	private String myValue;
	
	@GetMapping(path = "/myValue")
	private String myValue() {
		return this.myValue;
	}

}
