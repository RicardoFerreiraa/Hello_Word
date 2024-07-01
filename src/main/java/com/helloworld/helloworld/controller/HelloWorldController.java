package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello-World")
public class HelloWorldController {

@GetMapping
	public String helloworld() {
		return "Olá Mundo";
}
}
