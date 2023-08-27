package com.solution.proj.FakeBankInfo;

import com.solution.proj.AccountDto.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeOpenApi implements OpenAPIService{
    @Override
    public AllAccountsResponseDto getAccounts() {
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
}
