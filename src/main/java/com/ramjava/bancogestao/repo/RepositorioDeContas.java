package com.ramjava.bancogestao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramjava.bancogestao.entity.Conta;

public interface RepositorioDeContas extends JpaRepository<Conta, Long> {

}
