package com.solution.proj.Credit;

import com.solution.proj.FakeBankInfo.OpenAPIService;
import com.solution.proj.ProductByIdDto.ProductByIdDto;
import com.solution.proj.ProductDto.ProductDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CreditService implements ICreditService {
    private final CreditRepository creditRepository;
    private final OpenAPIService openAPIService;

    @Override
    public List<CreditDto> getCreditProducts() {
        List<CreditDto> dtos = new ArrayList<>();
        for (ProductDto productDto : openAPIService.getProducts().getData().getProducts()) {
            if (productDto.getProductType().equals("creditCard")
                    || productDto.getProductType().equals("loanCar")
                    || productDto.getProductType().equals("loanIndividual")
                    || productDto.getProductType().equals("loanLegalEntity")
                    || productDto.getProductType().equals("mortgage")) {
                Double interestRate = 1 + Math.random() * 14;
                Double repaymentPeriod = 1 + +Math.random() * 19;
                Double creditSum = 1000 + Math.random() * 15000000;
                dtos.add(new CreditDto(productDto.getProductId(),
                        productDto.getProductName(),
                        productDto.getProductType(),
                        productDto.getBrand().getBrandName(),
                        interestRate.toString(),
                        repaymentPeriod.toString(),
                        creditSum.toString()));
            }
        }
        return dtos;
    }

    @Override
    public CreditDto getCreditProductById(String productId){
        if (openAPIService.getProductById(productId).getData().getProduct().getProductName() != null) {
            ProductByIdDto credit = openAPIService.getProductById(productId).getData().getProduct();
            CreditDto dto = new CreditDto(
                    credit.getProductId(),
                    credit.getProductName(),
                    credit.getProductType(),
                    credit.getBrand().getBrandName(),
                    credit.getCreditInterest().getTierBandSet().get(0).getTierBand().get(0).getInterestRate(),
                    credit.getCreditInterest().getTierBandSet().get(0).getTierBand().get(0).getMaxTermPeriod(),
                    credit.getCreditInterest().getTierBandSet().get(0).getTierBand().get(0).getTierValueMaximum()
            );
            return dto;
        }
        return null;
    }


}
