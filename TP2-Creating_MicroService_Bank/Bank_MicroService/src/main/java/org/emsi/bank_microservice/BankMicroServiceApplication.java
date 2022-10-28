package org.emsi.bank_microservice;

import org.emsi.bank_microservice.entities.Account;
import org.emsi.bank_microservice.enums.AccountType;
import org.emsi.bank_microservice.repositories.AccountRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class BankMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AccountRepo accountRepo) {
        return args -> {
            for (int i = 0; i < 10; i++) {
                Account account = Account.builder()
                        .id(UUID.randomUUID().toString())
                        .balance(Math.random() * 99999)
                        .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                        .currency("MAD")
                        .build();

                accountRepo.save(account);
            }
        };
    }
}
