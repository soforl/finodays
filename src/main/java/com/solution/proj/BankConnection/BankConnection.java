package com.solution.proj.BankConnection;

import com.solution.proj.User.User;
import com.solution.proj.UserCredit.UserCredit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class BankConnection {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Boolean agreement;
    private String bankToken;
    private String bankName;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private User user;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "bankConnection")
    private List<UserCredit> credits;
}
