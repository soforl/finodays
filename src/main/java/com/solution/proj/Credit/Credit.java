package com.solution.proj.Credit;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
public class Credit {
    @Id
    private String id;
    private String name;
    private String type;
    private String bankName;
    private Double interestRate;
    private Double repaymentPeriod;
    private Double creditSum;

    public Credit() {

    }
}
