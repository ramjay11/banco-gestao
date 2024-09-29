package com.ramjava.bancogestao.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountNumber;
	@Column(name = "account_name")
	private String accountName;
	@Column(name = "account_balance")
	private BigDecimal accountBalance;
	
	public Conta() {}
	
	public Conta(String accountName, BigDecimal accountBalance) {
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Conta [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + "]";
	}
	
}
