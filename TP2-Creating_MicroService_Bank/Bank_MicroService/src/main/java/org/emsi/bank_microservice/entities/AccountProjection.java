package org.emsi.bank_microservice.entities;

import org.emsi.bank_microservice.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Account.class, name = "Projection_1")
public interface AccountProjection {
    public String getId();
    public AccountType getType();
    public Double getBalance();
}
