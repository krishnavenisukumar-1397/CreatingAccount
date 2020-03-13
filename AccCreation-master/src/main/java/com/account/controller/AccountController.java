package com.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.entities.Account;
import com.account.entities.Customer;
import com.account.formbean.AccountForm;
import com.account.formbean.UpdateAccount;
import com.account.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping(path = "/createaccount")
	public ResponseEntity<Account> createAccount(@RequestBody AccountForm form) {
		Account account = new Account(form.getIfsc(), form.getBalance(), form.isActive(), form.getAccountType());
		return new ResponseEntity<Account>(accountService.createAccount(account), HttpStatus.OK);

	}

	@PutMapping(path = "/updateaccount")
	public ResponseEntity<Account> updateAccount(@RequestBody UpdateAccount updateAccount) {
		Account account = accountService.UpdateAccount(updateAccount);
		return new ResponseEntity<Account>(account, HttpStatus.ACCEPTED);

	}

	@DeleteMapping(path = "deleteaccount/{accountNumber}")
	public ResponseEntity<Account> deleteAccount(@PathVariable(name = "accountNumber") Long accountNumber) {
		accountService.deleteAccount(accountNumber);
		return new ResponseEntity<Account>(HttpStatus.OK);
	}

	@GetMapping(path = "retriveaccount/{accountNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Account> getAccountByAccNum(@PathVariable(name = "accountNumber") Long accountNumber) {

		Account account = accountService.AccountretriveAccountUsingAccountNo(accountNumber);
		return new ResponseEntity<Account>(account,HttpStatus.OK);

	}

	@GetMapping(path = "retriveallaccount/{ifsc}")
	public ResponseEntity<List<Account>> getAccountsByIfsc(@PathVariable(name = "ifsc") String ifsc) {
		List<Account> accounts = accountService.retriveAllAccount(ifsc);
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);

	}

}
