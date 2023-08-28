package com.solution.proj.agreement.service;

import com.solution.proj.User.User;
import com.solution.proj.agreement.FakeAgreement;
import com.solution.proj.agreement.dto.response.AgreementResponse;
import com.solution.proj.agreement.dto.response.DataDto;
import com.solution.proj.agreement.entity.Agreement;
import com.solution.proj.agreement.entity.PermissionsType;
import com.solution.proj.agreement.entity.StatusType;
import com.solution.proj.agreement.repository.JpaAgreementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class AgreementServiceImpl implements AgreementService{

    private final JpaAgreementRepository jpaAgreementRepository;

    @Override
    public Agreement create(User user) {
        DataDto dataDto = sendRequestToApi();
        Agreement agreement = new Agreement();
        List<PermissionsType> permissions = dataDto.getPermissions()
                .stream()
                .map(PermissionsType::valueOf)
                .toList();
        agreement.setPermissionsTypes(permissions);
        agreement.setStatusType(StatusType.valueOf(dataDto.getStatus()));
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        LocalDateTime dateTime = LocalDateTime.parse(dataDto.getStatusUpdateDateTime(), formatter);
        if(dataDto.getExpirationDateTime().isEmpty()){
            agreement.setExpirationDateTime(dateTime.plusDays(90));
        }
        else {
            LocalDateTime expirationDateTime = LocalDateTime.parse(dataDto.getExpirationDateTime(), formatter);
            agreement.setExpirationDateTime(expirationDateTime);
        }
        agreement.setUser(user);
        return jpaAgreementRepository.save(agreement);
    }

    @Override
    public Agreement getById(UUID id) {
        return jpaAgreementRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Agreement with id: " + id + "not found"));
    }

    @Override
    public List<Agreement> getByUser(User user) {
        return jpaAgreementRepository.getAllByUser(user);
    }

    public DataDto sendRequestToApi(){
        FakeAgreement fakeAgreement = new FakeAgreement();
        AgreementResponse agreementResponse = fakeAgreement.getAgreement();
        return agreementResponse.getData();
    }
}
