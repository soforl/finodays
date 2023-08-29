package com.solution.proj.UserCredit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserCreditAccountDto {
    private String id;
    private Double interestRate;
    private Double creditSum;
    private String currency;
}
