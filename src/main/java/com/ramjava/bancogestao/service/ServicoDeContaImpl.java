package com.ramjava.bancogestao.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ramjava.bancogestao.entity.Conta;
import com.ramjava.bancogestao.repo.RepositorioDeContas;

@Service
public class ServicoDeContaImpl implements ServicoDeConta {
	
	private final RepositorioDeContas repo;

    public ServicoDeContaImpl(RepositorioDeContas repo) {
        this.repo = repo;
    }

	@Override
	public Conta createConta(Conta conta) {
		Conta saveConta =repo.save(conta);
		return saveConta;
	}

	@Override
	public Conta getContaDetailsByContaNumber(Long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conta> getAllContaDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conta depositAmount(Long accountNumber, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conta withdrawalAmount(Long accountNumber, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeAccount(Long accountNumber) {
		// TODO Auto-generated method stub
		
	}

}
