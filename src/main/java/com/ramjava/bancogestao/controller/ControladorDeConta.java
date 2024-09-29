package com.ramjava.bancogestao.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ramjava.bancogestao.entity.Conta;
import com.ramjava.bancogestao.service.ServicoDeConta;

@RestController
public class ControladorDeConta {
	
	private final ServicoDeConta service;
	
	public ControladorDeConta(ServicoDeConta service) {
		this.service = service;
	}

	@PostMapping("/create")
	public Conta createConta(@RequestBody Conta conta) {
		Conta createConta = service.createConta(conta);
		return createConta;
	}
}
