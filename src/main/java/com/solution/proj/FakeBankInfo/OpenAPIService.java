package com.solution.proj.FakeBankInfo;

import com.solution.proj.AccountDto.AllAccountsResponseDto;
import com.solution.proj.ProductByIdDto.AllProductByIdResponseDto;
import com.solution.proj.ProductDto.AllProductsResponseDto;
import org.springframework.stereotype.Component;

public interface OpenAPIService {
    AllAccountsResponseDto getAccounts(String token);
    AllAccountsResponseDto getAccountById(String token, String accountId);
    AllProductsResponseDto getProducts();

    AllProductByIdResponseDto getProductById(String productId);
}