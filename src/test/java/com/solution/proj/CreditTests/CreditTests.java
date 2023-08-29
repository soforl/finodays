package com.solution.proj.CreditTests;

import com.solution.proj.Credit.CreditDto;
import com.solution.proj.Credit.CreditService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CreditTests {
    @Autowired
    private CreditService creditService;

    @Test
    public void testGetAllCredits(){
        assertEquals("022eaab4-568b-4635-a5fb-fe91153e6cd6",
                creditService.getCreditProducts().get(0).getId());
    }

    @Test
    public void testGetCreditById() {
        CreditDto dto = creditService.getCreditProductById("022eaab4-568b-4635-a5fb-fe91153e6cd6");
        assertEquals("022eaab4-568b-4635-a5fb-fe91153e6cd6", dto.getId());
        assertEquals("МойПродукт", creditService.getCreditProductById("022eaab4-568b-4635-a5fb-fe91153e6cd6").getName());
    }

}
