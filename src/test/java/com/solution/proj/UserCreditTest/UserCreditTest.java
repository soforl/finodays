package com.solution.proj.UserCreditTest;

import com.solution.proj.User.User;
import com.solution.proj.UserCredit.IUserCreditService;
import com.solution.proj.UserCredit.UserCreditAccountDto;
import com.solution.proj.UserCredit.UserCreditService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserCreditTest {
    @Autowired
    private IUserCreditService iUserCreditService;
    @Autowired
    private UserCreditService userCreditService;

    @Test
    public void testGetAccountById(){
        User user = new User();
        user.setName("Test");
        user.setEmail("test@test.ru");
        user.setToken("wertyuio");

        UserCreditAccountDto dto = userCreditService.getAccountById(user, "account123");
        assertEquals("string", dto.getCurrency());
    }

    @Test
    public void testGetAllAccount(){
        User user = new User();
        user.setName("Test");
        user.setEmail("test@test.ru");
        user.setToken("wertyuio");

        List<UserCreditAccountDto> dto = userCreditService.getAllAccounts(user);

        assertEquals("account123", dto.stream().filter(userCreditAccountDto -> userCreditAccountDto.getId().equals("account123")).toList().get(0).getId());
    }

}
