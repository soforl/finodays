package com.solution.proj.UserCredit;

import com.solution.proj.BankConnection.BankConnection;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserCredit {
    @Id
    private String id;
    private Double interestRate;
    private Double creditSum;
    private String currency;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private BankConnection bankConnection;


    public UserCredit(String accountId, Double interestRate, Double creditSum, String currency) {
        this.creditSum = creditSum;
        this.interestRate = interestRate;
        this.id = id;
        this.currency = currency;
    }

    public UserCredit() {

    }
}
