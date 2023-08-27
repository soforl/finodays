package com.solution.proj.UserCredit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class UserCreditAccountDto {
    private UUID id;
    private Float interestRate;
    private LocalDateTime repaymentPeriod;
    private Double creditSum;
    private LocalDateTime finishDate;
    private Double sumNeededToPay;
    private Double monthlyPayment;
    private String currency;
}
