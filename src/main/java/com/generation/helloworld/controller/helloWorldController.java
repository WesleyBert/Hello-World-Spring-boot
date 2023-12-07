package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")
public class helloWorldController {

	@GetMapping
	public String HelloWorld(){
		return "Olá mundo";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<strong>BSM’s Generation Brazil:</strong> <br>"
				+ "<br/>Persistência.<br/>"
	            + "Mentalidade de Crescimento.<br/>"
	            + "Responsabilidade Pessoal.<br/>"
	            + "Orientação ao Futuro.<br/>"
	            + "Proatividade.<br/>"
	            + "Comunicação.<br/>"
	            + "Trabalho em Equipe.<br/>"
	            + "Orientação ao Detalhe.";
}
	@GetMapping("/aprendizagem")
	public String aprendizagem() {
		return "<Strong> Práticas de Estudos </Strong> <br>"
				+ "Estudar POO <br>"
				+ "Estudar SQL <br>"
				+ "Estudar React <br>"
				+ "Estudar Devops <br>";
	}
}