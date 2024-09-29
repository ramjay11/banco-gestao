package com.ramjava.bancogestao.service;

import java.util.List;

import com.ramjava.bancogestao.entity.Conta;

public interface ServicoDeConta {

	Conta createConta(Conta conta);
	Conta getContaDetailsByContaNumber(Long accountNumber);
	List<Conta> getAllContaDetails();
	Conta depositAmount(Long accountNumber, Double amount);
	Conta withdrawalAmount(Long accountNumber, Double amount);
	void closeAccount(Long accountNumber);
}
