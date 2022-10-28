package org.emsi.bank_microservice.mappers;

import org.emsi.bank_microservice.dto.AccountRequestDTO;
import org.emsi.bank_microservice.dto.AccountResponseDTO;
import org.emsi.bank_microservice.entities.Account;

public interface AccountMapper {
    AccountResponseDTO fromBankAccountWithBeansUtils(Account account);
    Account toBankAccountWithBeansUtils(AccountRequestDTO accountRequestDTO);
}
