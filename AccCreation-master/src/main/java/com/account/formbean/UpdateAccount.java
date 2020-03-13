package com.account.formbean;

public class UpdateAccount {

	private long accountNumber;
	private double balance;
	private boolean active;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean account_status) {
		this.active = account_status;
	}

	public long getaccountNumber() {
		return accountNumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "UpdateAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", active=" + active + "]";
	}

	public UpdateAccount() {
		super();

	}

}
