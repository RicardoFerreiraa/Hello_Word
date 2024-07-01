package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BsmController {

	@GetMapping ("BSM")
	public String BSM() {
		return "Todas as hab que aprendemos: Responsabilidade Pessoal, Mentalidade de Crescimento, Orientação ao Futuro "
				+ "Persistência, Comunicação, Atenção para Detalhes, Trabalho em Equipe e Proatividade!";
	}
	@GetMapping ("hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping ("objetivo-semana")
	public String Objetivo() {
		return "Conseguir entender o API por completo";
	}
}
