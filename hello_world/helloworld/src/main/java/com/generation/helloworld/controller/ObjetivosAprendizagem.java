package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosaprendizagem")

public class ObjetivosAprendizagem {

	@GetMapping
	public String bsmsgen() {
		return "Meus objetivos de aprendizagem da semana: "
				+ "- Praticar as funcionalidades do Spring Framework; "
				+ "- Estudar mais sobre API REST; "
				+ "- Definir as estratégias do Projeto Integrador em grupo.";
	}
}
