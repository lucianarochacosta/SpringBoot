package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsmsgen")

public class BsmsGen {
	@GetMapping
	public String bsmsgen() {
		return "GENERATION BRASIL "
				+ "*Habilidades: "
				+ "- Atenção aos detalhes; "
				+ "- Comunicação; "
				+ "- Proatividade; "
				+ "- Trabalho em equipe. "
				+ "*Mentalidades: "
				+ "- Orientação ao futuro; "
				+ "- Responsabilidade pessoal; "
				+ "- Mentalidade de crescimento; "
				+ "- Persistência. ";
	}
}
