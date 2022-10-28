package org.emsi.bank_microservice.services;

import org.emsi.bank_microservice.dto.AccountRequestDTO;
import org.emsi.bank_microservice.dto.AccountResponseDTO;
import org.emsi.bank_microservice.entities.Account;
import org.emsi.bank_microservice.mappers.AccountMapperImpl;
import org.emsi.bank_microservice.repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service @Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepo accountRepo;
    @Autowired
    private AccountMapperImpl accountMapper;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    @Override
    public AccountResponseDTO addAccount(AccountRequestDTO accountDTO) {
        Account account = accountMapper.toBankAccountWithBeansUtils(accountDTO);
        Account savedAccount = accountRepo.save(account);
        return accountMapper.fromBankAccountWithBeansUtils(savedAccount);
    }

    @Override
    public void deleteAccount(String id) {
        accountRepo.deleteById(id);
    }

    @Override
    public Account findAccountById(String id) {
        return accountRepo.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Account %s not found", id)));
    }

    @Override
    public Account updateAccount(AccountRequestDTO accountDTO, String id) {
        Account currAccount = findAccountById(id);
        if (accountDTO.getBalance() != null)
            currAccount.setBalance(accountDTO.getBalance());
        if (accountDTO.getCurrency() != null)
            currAccount.setCurrency(accountDTO.getCurrency());
        if (accountDTO.getType() != null)
            currAccount.setType(accountDTO.getType());
        return currAccount;
    }
}
