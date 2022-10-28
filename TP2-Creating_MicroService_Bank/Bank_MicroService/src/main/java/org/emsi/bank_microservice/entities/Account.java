package org.emsi.bank_microservice.entities;

import lombok.*;
import org.emsi.bank_microservice.enums.AccountType;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.util.Date;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Account {
    @Id
    private String id;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @CreationTimestamp @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
}
