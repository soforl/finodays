package com.solution.proj.User;

import com.solution.proj.BankConnection.BankConnection;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String email;
    private String token;

    @OneToMany(fetch = FetchType.EAGER)
    private List<BankConnection> bankConnections;
}
