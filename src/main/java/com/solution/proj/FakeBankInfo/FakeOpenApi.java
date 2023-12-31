package com.solution.proj.FakeBankInfo;

import com.solution.proj.AccountDto.*;
import com.solution.proj.ProductByIdDto.*;
import com.solution.proj.ProductDto.AllProductsResponseDto;
import com.solution.proj.ProductDto.BrandDto;
import com.solution.proj.ProductDto.ProductDataDto;
import com.solution.proj.ProductDto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeOpenApi implements OpenAPIService{
    @Override
    public AllAccountsResponseDto getAccounts(String token) {
        return AccountInfo();
    }

    private AllAccountsResponseDto AccountInfo() {
        DataDto data = new DataDto();

        AllAccountsResponseDto responseDto = new AllAccountsResponseDto();
        List<AccountDto> accounts = new ArrayList<>();

        List<AccountDetailDto> accountDetailDtoList = new ArrayList<>();

        AccountDetailDto accountDetails = new AccountDetailDto();
        accountDetails.setSchemeName("RU.CBR.PAN");
        accountDetails.setIdentification("123456789");
        accountDetails.setName("Account Name");
        accountDetailDtoList.add(accountDetails);

        List<PartyIdentificationDto> partyIdentificationDtoList = new ArrayList<>();
        PartyIdentificationDto partyIdentificationDto = new PartyIdentificationDto();
        partyIdentificationDto.setIdentification("string");
        partyIdentificationDto.setSchemeName("RU.CBR.TXID");
        partyIdentificationDtoList.add(partyIdentificationDto);

        List<PostalAddressDto> postalAddressDtoList = new ArrayList<>();
        List<String> adressLines = new ArrayList<>();
        adressLines.add("string");
        PostalAddressDto postalAddressDto = new PostalAddressDto();
        postalAddressDto.setAddressType("Business");
        postalAddressDto.setDepartment("string");
        postalAddressDto.setSubDepartment("string");
        postalAddressDto.setStreetName("string");
        postalAddressDto.setBuildingNumber("string");
        postalAddressDto.setPostCode("string");
        postalAddressDto.setTownName("string");
        postalAddressDto.setCountrySubDivision("string");
        postalAddressDto.setCountry("string");
        postalAddressDto.setAddressLine(adressLines);
        postalAddressDtoList.add(postalAddressDto);

        OwnerDto owner = new OwnerDto();
        owner.setName("ПАО Моя организация");
        owner.setMobileNumber("1234567890");
        owner.setCountryOfResidence("string");
        owner.setCityOfBirth("string");
        owner.setProvinceOfBirth("string");
        owner.setCityOfBirth("string");
        owner.setBirthDate("2019-08-24T14:15:22Z");
        owner.setPartyIdentification(partyIdentificationDtoList);
        owner.setPostalAddress(postalAddressDtoList);

        ServiceProviderDto serviceProvider = new ServiceProviderDto();
        serviceProvider.setSchemeName("RU.CBR.BICFI");
        serviceProvider.setIdentification("987654321");

        AccountDto account = new AccountDto();
        account.setAccountId("account123");
        account.setStatus("Enabled");
        account.setStatusUpdateDateTime("2019-08-24T14:15:22Z");
        account.setCurrency("string");
        account.setAccountType("Business");
        account.setAccountSubType("CreditCard");
        account.setAccountDescription("string");
        account.setAccountDetails(accountDetailDtoList);
        account.setOwner(owner);
        account.setServiceProvider(serviceProvider);
        accounts.add(account);

        data.setAccount(accounts);

        responseDto.setData(data);

        LinksDto linksDto = new LinksDto();
        linksDto.setSelf("http://example.com");
        linksDto.setFirst("http://example.com");
        linksDto.setPrev("http://example.com");
        linksDto.setNext("http://example.com");
        linksDto.setLast("http://example.com");

        responseDto.setLinks(linksDto);

        MetaDto meta = new MetaDto();
        meta.setTotalPages(0);
        responseDto.setMeta(meta);

        RiskDto risk = new RiskDto();
        responseDto.setRisk(risk);

        return responseDto;
    }

    @Override
    public AllAccountsResponseDto getAccountById(String token, String accountId) {
        return AccountInfo();
    }

    @Override
    public AllProductsResponseDto getProducts() {
        AllProductsResponseDto responseDto = new AllProductsResponseDto();

        BrandDto brandDto = new BrandDto();
        brandDto.setBrandName("МойБанкГрупп");
        brandDto.setApplicationUri("https://mybank.ru/products/credit-card/applay");

        List<ProductDto> products = new ArrayList<>();
        ProductDto productDto = new ProductDto();
        productDto.setProductId("022eaab4-568b-4635-a5fb-fe91153e6cd6");
        productDto.setProductName("МойПродукт");
        productDto.setProductType("creditCard");
        productDto.setProductVersion("13.201.001-rls");
        productDto.setBrand(brandDto);
        products.add(productDto);

        ProductDataDto productDataDto = new ProductDataDto();
        productDataDto.setProducts(products);

        responseDto.setData(productDataDto);

        LinksDto linksDto = new LinksDto();
        linksDto.setSelf("http://example.com");
        linksDto.setFirst("http://example.com");
        linksDto.setPrev("http://example.com");
        linksDto.setNext("http://example.com");
        linksDto.setLast("http://example.com");

        responseDto.setLinks(linksDto);

        MetaDto meta = new MetaDto();
        meta.setTotalPages(0);
        responseDto.setMeta(meta);

        return responseDto;
    }

    @Override
    public AllProductByIdResponseDto getProductById(String productId) {
        AllProductByIdResponseDto responseDto = new AllProductByIdResponseDto();

        ProductByIdDataDto product =  new ProductByIdDataDto();

        BrandDto brandDto = new BrandDto();
        brandDto.setApplicationUri("https://mybank.ru/products/credit-card/applay");
        brandDto.setBrandName("МойБанкГрупп");

        List<TierBandDto> tierBandDtoList = new ArrayList<>();
        TierBandDto tierBandDto = new TierBandDto();
        tierBandDto.setAer("5");
        tierBandDto.setComments(List.of("Информация для клиента"));
        tierBandDto.setIdentification("₽1000-₽5000");
        tierBandDto.setTierCurrency("RUB");
        tierBandDto.setInterestRate("5");
        tierBandDto.setTierValueMinimum("200.00");
        tierBandDto.setTierValueMaximum("200.00");
        tierBandDto.setTierPrimaryValueMinimum("200.00");
        tierBandDto.setTierPrimaryValueMaximum("200.00");
        tierBandDto.setTierRemainValueMinimum("200.00");
        tierBandDto.setTierValueMinTerm(1);
        tierBandDto.setMinTermPeriod("Month");
        tierBandDto.setTierValueMaxTerm(10);
        tierBandDto.setMaxTermPeriod("Month");
        tierBandDto.setApplicationFrequency("Monthly");
        tierBandDto.setCalculationFrequency("Monthly");
        tierBandDtoList.add(tierBandDto);

        List<TierBandSetDto> tierBandSetDtoList = new ArrayList<>();
        TierBandSetDto tierBandSetDto = new TierBandSetDto();
        tierBandSetDto.setTierBandMethod("Tiered");
        tierBandSetDto.setCalculationMethod("SimpleInterest");
        tierBandSetDto.setDestination("CurrentAccount");
        tierBandSetDto.setComments(List.of("Информация для клиента"));
        tierBandSetDto.setTierBand(tierBandDtoList);
        tierBandSetDtoList.add(tierBandSetDto);

        CreditInterestDto creditInterestDto = new CreditInterestDto();
        creditInterestDto.setComments(List.of("Информация для клиента"));
        creditInterestDto.setTierBandSet(tierBandSetDtoList);

        ProductByIdDto productByIdDto = new ProductByIdDto();
        productByIdDto.setProductId("022eaab4-568b-4635-a5fb-fe91153e6cd6");
        productByIdDto.setProductName("МойПродукт");
        productByIdDto.setProductType("creditCard");
        productByIdDto.setProductVersion("13.201.001-rls");
        productByIdDto.setBrand(brandDto);
        productByIdDto.setCreditInterest(creditInterestDto);

        product.setProduct(productByIdDto);

        responseDto.setData(product);

        LinksDto linksDto = new LinksDto();
        linksDto.setSelf("http://example.com");
        linksDto.setFirst("http://example.com");
        linksDto.setPrev("http://example.com");
        linksDto.setNext("http://example.com");
        linksDto.setLast("http://example.com");

        responseDto.setLinks(linksDto);

        MetaDto meta = new MetaDto();
        meta.setTotalPages(0);
        responseDto.setMeta(meta);

        return responseDto;
    }
}
