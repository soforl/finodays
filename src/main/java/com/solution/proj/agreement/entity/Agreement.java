package com.solution.proj.agreement.entity;

import com.solution.proj.User.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "agreements")
@Data
public class Agreement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "permissions")
    @ElementCollection
    private List<PermissionsType> permissionsTypes;
    @Column(name = "status")
    private StatusType statusType;
    @Column(name = "status_update_date_time")
    private LocalDateTime statusUpdateDateTime;
    @Column(name = "expiration_date_time")
    private LocalDateTime expirationDateTime;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;



}
