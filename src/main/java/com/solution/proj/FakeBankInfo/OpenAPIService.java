package com.solution.proj.FakeBankInfo;

import com.solution.proj.AccountDto.AllAccountsResponseDto;

public interface OpenAPIService {
    AllAccountsResponseDto getAccounts();
}