package com.solution.proj.UserCredit;

import com.solution.proj.AccountDto.AccountDto;
import com.solution.proj.FakeBankInfo.OpenAPIService;
import com.solution.proj.User.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserCreditService implements IUserCreditService{
    private final OpenAPIService openAPIService;
    private final UserCreditRepository iUserCredit;


    public List<UserCreditAccountDto> getAllAccounts(User user) {
        List<UserCreditAccountDto> dtos = new ArrayList<>();
        for (AccountDto account:openAPIService.getAccounts(user.getToken()).getData().getAccount()) {

            Double interestRate = 1 + Math.random() * 14;
            Double creditSum = 1000 + Math.random() * 15000000;
            dtos.add(new UserCreditAccountDto(account.getAccountId(),
                    interestRate,
                    creditSum,
                    account.getCurrency()));
        }
        return dtos;
    }

    @Override
    public UserCreditAccountDto getAccountById(User user, String accountId) {
        for (AccountDto account:openAPIService.getAccountById(user.getToken(), accountId).getData().getAccount()) {
            if (account.getAccountId().equals(accountId)){
                Double interestRate = 1 + Math.random() * 14;
                Double creditSum = 1000 + Math.random() * 15000000;
                UserCreditAccountDto dto = new UserCreditAccountDto(
                        account.getAccountId(),
                        interestRate,
                        creditSum,
                        account.getCurrency());
                return dto;
            }
        }
        return null;
    }
}
