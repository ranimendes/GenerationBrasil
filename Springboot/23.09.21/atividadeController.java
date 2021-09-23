package com.atividadespringboot.atividadespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping ("/atividade1")
	
public class atividadeController {
	
	@GetMapping
	public String ex01() {
		
		return "A mentalidade usada foi persistência e a habilidade atenção aos detalhes.";
		
	}
}
