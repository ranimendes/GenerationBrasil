package com.atividadespringboot.atividade2springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping ("/atividade2")
	
public class atividade2Controller {
	
	@GetMapping
	public String ex02() {
		
		return "Realizar mais exercícios com spring.";
		
	}
}
