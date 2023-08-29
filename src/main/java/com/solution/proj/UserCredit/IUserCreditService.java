package com.solution.proj.UserCredit;

import com.solution.proj.User.User;

import java.util.List;

public interface IUserCreditService {
    // этот запрос может быть кэширован
    List<UserCreditAccountDto> getAllAccounts(User user);
    UserCreditAccountDto getAccountById(User user, String accountId);
}
