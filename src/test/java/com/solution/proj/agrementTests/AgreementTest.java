package com.solution.proj.agrementTests;

import com.solution.proj.ProjApplication;
import com.solution.proj.User.User;
import com.solution.proj.agreement.entity.Agreement;
import com.solution.proj.agreement.repository.JpaAgreementRepository;
import com.solution.proj.agreement.service.AgreementServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest(classes = ProjApplication.class)
public class AgreementTest {

    @Mock
    private JpaAgreementRepository jpaAgreementRepository;

    @InjectMocks
    private AgreementServiceImpl agreementService;

    private static User createUser(){
        User user = new User();
        user.setName("Ivan");
        user.setEmail("Ivan@mail.ru");
        return user;
    }

    @Test
    public void testCreate() {
        User user = createUser();

        when(jpaAgreementRepository.save(any(Agreement.class))).thenReturn(new Agreement());

        Agreement result = agreementService.create(user);

        verify(jpaAgreementRepository, times(1)).save(any(Agreement.class));

        assertNotNull(result);
    }

    @Test
    void testGetById() {
        UUID id = UUID.randomUUID();
        Agreement agreement = new Agreement();
        agreement.setId(id);


        when(jpaAgreementRepository.findById(id)).thenReturn(Optional.of(agreement));

        Agreement result = agreementService.getById(id);

        assertEquals(agreement, result);
        verify(jpaAgreementRepository, times(1)).findById(id);
    }

    @Test
    void testGetById_ThrowsException_WhenAgreementNotFound() {
        UUID id = UUID.randomUUID();

        when(jpaAgreementRepository.findById(id)).thenReturn(Optional.empty());

        assertThrows(IllegalArgumentException.class, () -> agreementService.getById(id));
        verify(jpaAgreementRepository, times(1)).findById(id);
    }

    @Test
    void testGetByUser() {
        User user = createUser();
        Agreement agreement1 = agreementService.create(user);
        Agreement agreement2 = agreementService.create(user);
        List<Agreement> expectedAgreements = Arrays.asList(agreement1, agreement2);

        when(jpaAgreementRepository.getAllByUser(user)).thenReturn(expectedAgreements);
        List<Agreement> result = agreementService.getByUser(user);

        assertEquals(expectedAgreements, result);
        verify(jpaAgreementRepository, times(1)).getAllByUser(user);
    }

}
