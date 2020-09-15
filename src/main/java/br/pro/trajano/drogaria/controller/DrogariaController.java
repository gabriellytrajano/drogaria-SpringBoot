package br.pro.trajano.drogaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drogaria")
public class DrogariaController {
	@RequestMapping("/saudacao")
	public String exibirMensagem() {
		return "Bem vindo(a)!";
	}

}
