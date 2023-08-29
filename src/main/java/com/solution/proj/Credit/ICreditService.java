package com.solution.proj.Credit;

import java.util.List;

public interface ICreditService {
    List<CreditDto> getCreditProducts();
    CreditDto getCreditProductById(String productId);
}
