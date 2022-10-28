package org.emsi.bank_microservice.services;

import org.emsi.bank_microservice.dto.AccountRequestDTO;
import org.emsi.bank_microservice.dto.AccountResponseDTO;
import org.emsi.bank_microservice.entities.Account;

import java.util.List;

public interface AccountService {
    AccountResponseDTO addAccount(AccountRequestDTO accountDTO);
    Account updateAccount(AccountRequestDTO accountDTO, String id);
    void deleteAccount(String id);
    Account findAccountById(String id);
    List<Account> getAllAccounts();
}
