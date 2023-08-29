package com.solution.proj.agreement.service;

import com.solution.proj.User.User;
import com.solution.proj.agreement.dto.response.AgreementResponse;
import com.solution.proj.agreement.dto.response.DataDto;
import com.solution.proj.agreement.entity.Agreement;

import java.util.List;
import java.util.UUID;

public interface AgreementService {
    Agreement create(User user);
    Agreement getById(UUID id);
    List<Agreement> getByUser(User user);

}
