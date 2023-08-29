package com.solution.proj.agreement;

import com.solution.proj.agreement.dto.response.AgreementResponse;
import com.solution.proj.agreement.dto.response.DataDto;
import com.solution.proj.agreement.dto.response.LinksDto;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class FakeAgreement{
    public AgreementResponse getAgreement(){
        AgreementResponse agreementResponse = new AgreementResponse();
        agreementResponse.setData(createDataDto());
        agreementResponse.setLinks(createLinksDto());
        return agreementResponse;
    }


    public DataDto createDataDto(){
        DataDto dataDto = new DataDto();
        dataDto.setConsentId("urn-alphabank-intent-88379");
        dataDto.setStatus("AwaitingAuthorisation");
        dataDto.setStatusUpdateDateTime("2023-05-02T00:00:00+00:00");
        dataDto.setPermissions(Arrays.asList("ReadAccountsBasic", "ReadAccountsDetail", "ReadBalances",
                "ReadTransactionsBasic", "ReadTransactionsCredits", "ReadTransactionsDetail"));
        dataDto.setExpirationDateTime("");
        return dataDto;
    }

    public LinksDto createLinksDto(){
        LinksDto linksDto = new LinksDto();
        linksDto.setSelf("https://bank.ru/open-banking/v1.0/aisp/account-consents/bank-consent-88379");
        return linksDto;
    }
}
