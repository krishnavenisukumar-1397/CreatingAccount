package com.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CreateAccountApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CreateAccountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
