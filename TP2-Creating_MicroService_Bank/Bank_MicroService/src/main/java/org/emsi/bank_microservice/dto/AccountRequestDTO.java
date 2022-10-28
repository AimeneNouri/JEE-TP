package org.emsi.bank_microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.emsi.bank_microservice.enums.AccountType;

@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class AccountRequestDTO {
    private Double balance;
    private String currency;
    private AccountType type;
}
