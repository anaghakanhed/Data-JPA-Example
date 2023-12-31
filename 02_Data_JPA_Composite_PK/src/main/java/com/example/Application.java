package com.example;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Account;
import com.example.entity.AccountPK;
import com.example.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		AccountRepository accountRepo = context.getBean(AccountRepository.class);
		
		/*AccountPK pk = new AccountPK();
		pk.setAccId(2);
		pk.setAccType("Current");
		pk.setAccNum(32435668l);
		
		Account acc = new Account();
		acc.setHolderName("Raju");
		acc.setBranch("Ameerpet");
		acc.setAccountPk(pk);
		
		accountRepo.save(acc);*/
		
		AccountPK pk = new AccountPK();
		pk.setAccId(2);
		pk.setAccType("Current");
		pk.setAccNum(32435668l);
		
		Optional<Account> findById = accountRepo.findById(pk);
		System.out.println(findById.get());
	}
}
