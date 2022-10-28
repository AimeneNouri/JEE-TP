package org.emsi.bank_microservice.mappers;

import org.emsi.bank_microservice.dto.AccountRequestDTO;
import org.emsi.bank_microservice.dto.AccountResponseDTO;
import org.emsi.bank_microservice.entities.Account;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class AccountMapperImpl implements AccountMapper{
    @Override
    public AccountResponseDTO fromBankAccountWithBeansUtils(Account account) {
        AccountResponseDTO accountResponseDTO = new AccountResponseDTO();
        BeanUtils.copyProperties(account, accountResponseDTO);
        return accountResponseDTO;
    }

    @Override
    public Account toBankAccountWithBeansUtils(AccountRequestDTO accountRequestDTO) {
        Account account = Account.builder()
                .id(UUID.randomUUID().toString())
                .build();
        BeanUtils.copyProperties(accountRequestDTO, account);
        return account;
    }
}
