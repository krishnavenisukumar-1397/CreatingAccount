package com.account.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.account.Exception.AccountNotFoundException;
import com.account.Exception.CustomerNotFoundException;
import com.account.Exception.NoSufficientAmountException;
import com.account.entities.Account;
import com.account.entities.Customer;
import com.account.formbean.UpdateAccount;
import com.account.repository.AccountRepo;
import com.account.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accountRepository;

	@Override
	public Account createAccount(Account account) {

		Account account2 = accountRepository.save(account);

		return account2;
	}

	@Override
	public Account UpdateAccount(UpdateAccount updateAccount) {
		Account accountToUpdated = accountRepository.findById(updateAccount.getaccountNumber())
				.orElseThrow(AccountNotFoundException::new);
		accountToUpdated.setActive(updateAccount.isActive());
		accountToUpdated.setBalance(updateAccount.getBalance());
		accountRepository.save(accountToUpdated);
		return accountToUpdated;
	}

	@Override
	public void deleteAccount(long accountNumber) {
		accountRepository.deleteById(accountNumber);

	}

	@Override
	public List<Account> retriveAllAccount(String ifsc) {
		List<Account> account = accountRepository.findByIfsc(ifsc);
		return account;
	}

	@Override
	public Account AccountretriveAccountUsingAccountNo(long accountNumber) {
		Account accounts = accountRepository.findById(accountNumber).orElseThrow(AccountNotFoundException::new);
		return accounts;

	}

}
