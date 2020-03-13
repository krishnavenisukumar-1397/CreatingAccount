package com.account.formbean;

import com.account.entities.AccountType;

public class AccountForm {

	private double balance;
	private String ifsc;
	private boolean active;
	private AccountType accountType;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}


	public AccountForm(double balance, String ifsc, boolean active, AccountType accountType) {
		super();
		this.balance = balance;
		this.ifsc = ifsc;
		this.active = active;
		this.accountType = accountType;
	}

	public AccountForm() {
		super();

	}

}
