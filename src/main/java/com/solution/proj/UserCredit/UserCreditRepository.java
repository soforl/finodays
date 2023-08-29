package com.solution.proj.UserCredit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserCreditRepository extends JpaRepository<UserCredit, UUID> {
}
