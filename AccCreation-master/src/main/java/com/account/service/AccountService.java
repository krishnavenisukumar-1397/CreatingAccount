package com.account.service;

import java.util.List;

import com.account.entities.Account;
import com.account.entities.Customer;
import com.account.formbean.UpdateAccount;

public interface AccountService {

	Account createAccount(Account account);

	Account UpdateAccount(UpdateAccount updateAccount);

	public void deleteAccount(long accountNumber);

	public List<Account> retriveAllAccount(String ifsc);

	public Account AccountretriveAccountUsingAccountNo(long accountNumber);

}
