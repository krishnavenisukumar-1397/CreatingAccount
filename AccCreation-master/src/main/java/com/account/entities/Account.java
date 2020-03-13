package com.account.entities;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
//@SequenceGenerator(name = "accountsequence", initialValue = 657824, allocationSize = 1)
@Table(name = "account_01")
public class Account {

	@Id
	@Column(name="account_num")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountNumber;
	private String ifsc;
	private double balance;
	private boolean active;
	private AccountType accountType;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
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

	public Account(String ifsc, double balance, boolean active, AccountType accountType) {
		super();
		this.ifsc = ifsc;
		this.balance = balance;
		this.active = active;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", ifsc=" + ifsc + ", balance=" + balance + ", active="
				+ active + ", accountType=" + accountType + "]";
	}

	public Account() {
		super();
		

	}
	

}
