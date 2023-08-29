package com.solution.proj.Credit;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CreditDto {
    private String id;
    private String name;
    private String type;
    private String bankName;
    private String interestRate;
    private String repaymentPeriod;
    private String creditSum;
}
