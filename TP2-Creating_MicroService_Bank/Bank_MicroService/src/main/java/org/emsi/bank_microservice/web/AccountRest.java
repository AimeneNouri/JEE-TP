package org.emsi.bank_microservice.web;

import org.emsi.bank_microservice.dto.AccountRequestDTO;
import org.emsi.bank_microservice.dto.AccountResponseDTO;
import org.emsi.bank_microservice.entities.Account;
import org.emsi.bank_microservice.repositories.AccountRepo;
import org.emsi.bank_microservice.services.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountRest {
    private AccountService accountService;

    public AccountRest(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/Accounts")
    public List<Account> bankAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/Accounts/{id}")
    public Account getAccountById(@PathVariable String id) {
        return accountService.findAccountById(id);
    }

    @PostMapping("/Accounts")
    public AccountResponseDTO saveAccount(@RequestBody AccountRequestDTO accountDTO) {
        return accountService.addAccount(accountDTO);
    }

    @PutMapping("/Accounts/{id}")
    public Account updateAccount(@PathVariable String id, @RequestBody AccountRequestDTO accountRequestDTO) {
        return accountService.updateAccount(accountRequestDTO, id);
    }

    @DeleteMapping("/Accounts/{id}")
    public void deleteAccount(@PathVariable String id) {
        accountService.deleteAccount(id);
    }
}
