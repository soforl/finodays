package com.solution.proj.agreement.repository;

import com.solution.proj.User.User;
import com.solution.proj.agreement.entity.Agreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface JpaAgreementRepository extends JpaRepository<Agreement, UUID> {
    List<Agreement> getAllByUser(User user);
}
